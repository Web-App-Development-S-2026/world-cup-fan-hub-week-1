# Thymeleaf Cheat Sheet (World Cup Hub Edition)

## Quick Start

Thymeleaf uses the `th:` namespace to add dynamic functionality to HTML. Always include the namespace in your template:

```html
<html xmlns:th="http://www.thymeleaf.org">
```

---

## Core Attributes

### Variable Expression: `th:text` and `th:utext`

Display model data in HTML elements.

```html
<!-- th:text = escapes HTML (safe) -->
<h1 th:text="${team.name}">Team Name</h1>

<!-- th:utext = renders raw HTML (use with caution) -->
<div th:utext="${event.description}">Event Description</div>
```

### Attribute Binding: `th:attr`

Bind model data to any HTML attribute.

```html
<!-- Single attribute -->
<img th:src="${team.flagUrl}" alt="Team Flag">

<!-- Multiple attributes -->
<a th:attr="href=@{/teams/{id}(id=${team.id})}" th:text="${team.name}">Link</a>

<!-- Shorthand for common attributes -->
<input th:value="${team.name}">
<button th:disabled="${event.isFull}">Join Event</button>
<a th:href="@{/home}">Home</a>
```

---

## Iteration: `th:each`

Loop through collections.

```html
<!-- Basic iteration -->
<tr th:each="team : ${teams}">
  <td th:text="${team.name}">Name</td>
  <td th:text="${team.confederation}">Confederation</td>
</tr>

<!-- Access iteration status (index, count, first, last, etc.) -->
<div th:each="team, stat : ${teams}">
  <span th:text="${stat.index}">0</span> <!-- 0-based index -->
  <span th:text="${stat.count}">1</span> <!-- 1-based count -->
  <span th:if="${stat.first}">Top Ranked Team</span>
  <span th:if="${stat.last}">Lowest Ranked Team</span>
</div>
```

---

## Conditionals: `th:if`, `th:unless`

Display elements conditionally.

```html
<!-- Show if condition is true -->
<div th:if="${team.ranking <= 10}">
  <p>Top 10 Contender!</p>
</div>

<!-- Show if condition is false -->
<div th:unless="${event.isCancelled}">
  <p>Event is happening as scheduled!</p>
</div>

<!-- Switch statement (multiple conditions) -->
<div th:switch="${match.status}">
  <span th:case="'LIVE'">Match is Live!</span>
  <span th:case="'FINISHED'">Match Concluded</span>
  <span th:case="*">Scheduled</span> <!-- Default case -->
</div>
```

---

## URL Generation: `@{}`

Generate application URLs with parameters (prevents hardcoding).

```html
<!-- Simple path -->
<a th:href="@{/teams}">View All Teams</a>

<!-- With parameters -->
<a th:href="@{/teams/{id}(id=${team.id})}">View Team</a>

<!-- Multiple parameters -->
<a th:href="@{/search(name=${team.name},confederation=${team.confederation})}">Search</a>

<!-- Path with query string -->
<a th:href="@{/matches(page=2,sort='date')}">Next Page</a>
```

---

## Form Binding: `th:object`, `th:field`

Bind model objects to forms for two-way binding and error handling.

```html
<!-- Bind form to object -->
<form th:action="@{/events/save}" th:object="${eventForm}" method="post">
  
  <!-- Simple field binding -->
  <input type="text" th:field="*{title}" placeholder="Event Title">
  
  <!-- Error messages -->
  <span th:if="${#fields.hasErrors('title')}" 
        th:errors="*{title}" 
        class="error">Title error</span>
  
  <!-- Select dropdown -->
  <select th:field="*{venue}">
    <option th:each="v : ${venues}" th:value="${v}" th:text="${v}">Select Venue</option>
  </select>
  
  <!-- Checkbox -->
  <input type="checkbox" th:field="*{isPublic}">
  
  <!-- Radio button -->
  <input type="radio" th:field="*{eventType}" th:value="'WatchParty'">
  <input type="radio" th:field="*{eventType}" th:value="'Debate'">
  
  <button type="submit">Create Event</button>
</form>
```

### Global Errors & Field Errors

```html
<!-- Display all validation errors -->
<div th:if="${#fields.hasErrors('*')}">
  <ul>
    <li th:each="err : ${#fields.errors('*')}" th:text="${err}">Error</li>
  </ul>
</div>

<!-- Display specific field errors -->
<div th:if="${#fields.hasErrors('capacity')}">
  <p th:errors="*{capacity}">Capacity error</p>
</div>
```

---

## Fragment Reusability: `th:insert`, `th:replace`

Reuse HTML snippets across templates.

```html
<!-- Define a fragment in navbar.html -->
<nav th:fragment="navbar">
  <ul>
    <li><a th:href="@{/home}">Home</a></li>
    <li><a th:href="@{/teams}">Teams</a></li>
    <li><a th:href="@{/events}">Events</a></li>
  </ul>
</nav>

<!-- Include fragment in another template (inserts as child) -->
<div th:insert="navbar :: navbar"></div>

<!-- Replace fragment (replaces the element itself) -->
<div th:replace="navbar :: navbar"></div>

<!-- Simplified syntax (if fragment name matches file name) -->
<div th:replace="navbar"></div>
```

---

## Variables & Scope: `th:with`

Define local variables in templates.

```html
<!-- Single variable -->
<div th:with="maxCapacity=500">
  <span th:text="${event.capacity > maxCapacity ? 'Massive Event' : 'Standard Event'}">Status</span>
</div>

<!-- Multiple variables -->
<div th:with="home=${match.homeScore}, away=${match.awayScore}">
  <p th:text="${home > away ? 'Home Winning' : 'Away Winning'}">Status</p>
</div>

<!-- In loops -->
<div th:each="team : ${teams}" th:with="seed=${team.ranking / 10}">
  <p th:text="'Pot: ' + ${seed}">Pot</p>
</div>
```

---

## String Interpolation

Combine variables with text.

```html
<!-- Pipe syntax -->
<p th:text="|Welcome back, ${user.username}!|">Welcome</p>

<!-- String concatenation -->
<p th:text="'Total Goals: ' + ${match.totalGoals}">Goals</p>

<!-- In attributes -->
<a th:href="@{/teams}" th:title="|Click to view ${team.name} profile|">Link</a>
```

---

## Utility Objects (Built-in)

Thymeleaf provides powerful utility objects for common tasks.

### `#strings` - String Utilities

```html
<!-- Check if empty/blank -->
<div th:if="${#strings.isEmpty(team.name)}">
  <p>Name is empty</p>
</div>

<!-- String operations -->
<p th:text="${#strings.toUpperCase(team.name)}">Name</p>
<p th:text="${#strings.toLowerCase(team.name)}">Name</p>
<p th:text="${#strings.length(team.name)}">Length</p>
<p th:text="${#strings.substring(team.name, 0, 3)}">Substring</p>
<p th:if="${#strings.contains(team.name, 'Brazil')}">Contains</p>
```

### `#numbers` - Number Formatting

```html
<!-- Format numbers -->
<p th:text="${#numbers.formatDecimal(team.winPercentage, 1, 2)}">75.50</p>
<p th:text="${#numbers.formatInteger(event.capacity, 4)}">0000</p>
```

### `#dates` - Date Formatting

```html
<!-- Format dates -->
<p th:text="${#dates.format(match.matchTime, 'yyyy-MM-dd')}">Date</p>
<p th:text="${#dates.format(match.matchTime, 'dd/MM/yyyy HH:mm')}">DateTime</p>
```

### `#lists` - List/Collection Utilities

```html
<!-- Check if list is empty -->
<div th:if="${#lists.isEmpty(teams)}">
  <p>No teams found</p>
</div>

<!-- Get list size -->
<p th:text="${#lists.size(teams)}">Count</p>
```

### `#fields` - Form Field Utilities

```html
<!-- Check if field has errors -->
<span th:if="${#fields.hasErrors('title')}" class="error">Invalid</span>

<!-- Get all errors for a field -->
<p th:if="${#fields.hasAnyErrors()}" class="error">Form has errors</p>
```

---

## CSS & Class Management

### `th:class` - Dynamic CSS Classes

```html
<!-- Conditional class -->
<div th:classappend="${team.ranking <= 10 ? 'top-tier' : 'standard-tier'}">
  Team Card
</div>

<!-- Multiple classes -->
<div th:class="${event.isFull ? 'full' : 'open'} + ' event-card'">
  Event Status
</div>

<!-- Using object -->
<div th:class="@{${match.status}=='LIVE' ? 'pulse-live' : 'standard'}">
  Match Box
</div>
```

### `th:style` - Dynamic Inline Styles

```html
<!-- Conditional style -->
<div th:style="${event.capacity < 10 ? 'color: red' : 'color: green'}">
  Tickets Status
</div>

<!-- Multiple styles -->
<p th:style="'color:' + ${event.isFull ? 'red' : 'black'} + '; font-weight: bold;'">
  Status
</p>
```

---

## Operators & Expressions

### Comparison & Logical Operators

```html
<!-- Comparison -->
<span th:if="${team.ranking <= 10}">Top Contender</span>
<span th:if="${event.capacity < 50}">Small Gathering</span>
<span th:if="${match.status == 'LIVE'}">Live Now</span>
<span th:if="${team.name != 'Unknown'}">Named</span>

<!-- Logical operators -->
<span th:if="${team.ranking <= 10 and team.confederation == 'UEFA'}">Top Euro Team</span>
<span th:if="${match.status == 'LIVE' or match.status == 'UPCOMING'}">Active Match</span>
<span th:if="${!event.isCancelled}">Going Ahead</span>
```

### Ternary Operator

```html
<p th:text="${event.capacity > 100 ? 'Large Event' : 'Small Event'}">Status</p>

<!-- Elvis operator (simpler syntax) -->
<p th:text="${team.nickname ?: 'No Nickname'}">Nickname or default</p>
```

---

## Comments

```html
<!-- Standard HTML comment (visible in page source) -->
<!-- This is visible -->

<!-- Thymeleaf comment (removed during processing) -->
<!--/* This comment is removed by Thymeleaf */-->

<!-- Multi-line Thymeleaf comment -->
<!--/*
<div th:each="team : ${teams}">
  This code won't render
</div>
*/-->
```

---

## Common Patterns

### Display & Default Values

```html
<!-- Show value or default text -->
<p th:text="${team.coachName} ?: 'TBA'">Coach</p>

<!-- Show if exists, hide if null -->
<p th:if="${event.specialInstructions}" th:text="${event.specialInstructions}"></p>
```

### Conditional Display with Bootstrap Classes

```html
<div th:class="'alert ' + ${error ? 'alert-danger' : 'alert-success'}">
  <span th:text="${error ?: 'Successfully Joined Event!'}">Message</span>
</div>
```

### Form Errors with Styling

```html
<div class="form-group">
  <label th:for="title">Event Title</label>
  <input type="text" 
         th:field="*{title}" 
         th:class="${#fields.hasErrors('title') ? 'form-control is-invalid' : 'form-control'}"
         class="form-control">
</div>
```

## Tips & Best Practices

1. **Always escape user input** - Use `th:text` instead of `th:utext` unless you specifically need raw HTML.
2. **Use `@{}` for URLs** - Never hardcode paths; use `@{}` for flexibility.
3. **Leverage fragments** - Extract common UI patterns (like the navbar) into reusable fragments.
4. **Use `th:object` for forms** - Makes binding cleaner and enables error handling when creating predictions or events.
5. **Prefer `th:classappend`** - When adding classes conditionally to existing ones.
6. **Use utility objects** - `#strings`, `#numbers`, `#dates`, etc. reduce Java logic in templates.
7. **Keep templates simple** - Complex ranking/probability logic belongs in the Spring Controllers or Services, not templates.
