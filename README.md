# Lab 1 - Thymeleaf Demo
## Course Information
**Course:** CPAN 228  
**Topic:** Implementing Controllers & Thymeleaf Templates

## Getting Started
This is a starter template for your lab assignments. Follow the GitHub setup below before beginning your work.

### GitHub Setup
1. **Fork the Repository**
   - Go to the repository on GitHub
   - Click the "Fork" button in the top-right corner
   - This creates your own copy of the project

2. **Clone Your Fork**
   ```bash
   git clone https://github.com/YOUR-USERNAME/world-cup-fan-hub-week-1.git
   cd world-cup-fan-hub-week-1
   ```

3. **Add Upstream Remote**
   ```bash
   git remote add upstream https://github.com/ORIGINAL-REPO.git
   ```

4. **Pull Latest Changes**
   ```bash
   git pull upstream main
   ```

5. **Create a Feature Branch**
   ```bash
   git checkout -b feature/lab-yourname
   ```
   *(Replace yourname with your actual name, e.g., feature/lab1-john-doe)*

## Lab 1 Assignment

### About Controller Implementation
Implement a new `AboutController` with the following requirements:

#### Endpoint Requirements
- **Path:** `localhost:8080/about`
- **HTTP Method:** GET
- **Return:** HTML template displaying content about the **2026 World Cup** and the participating countries.

#### Template Requirements
- **Heading:** Display an `<h1>` tag using `th:text` to pass a dynamic title like "Welcome to the 2026 World Cup Hub!" from your controller.
- **Description:** Add a description of the 2026 World Cup and what makes it special (e.g., hosted by 3 countries: USA, Canada, Mexico).
- **Thymeleaf Usage:** Use at least one Thymeleaf expression (like `th:text` or `th:utext`) to display dynamic data passed from the controller.
- **Styling:** Be creative! Use any HTML elements you like. Make it visually appealing using the existing `styles.css`.
- **Static Assets (CSS & Images):** If you want to add your own CSS files or images, make sure to place them in the `src/main/resources/static/` folder. Spring Boot automatically serves files from this location. You can reference them in your templates using Thymeleaf's URL syntax, e.g., `<link rel="stylesheet" th:href="@{/your-style.css}">` or `<img th:src="@{/your-image.png}">`.
- Include at least 2-3 sentences of meaningful content.

#### Example  (Not required to use this content)
```html
<h1 th:text="${pageTitle}">World Cup 2026</h1>
<p>The 2026 FIFA World Cup will be the 23rd FIFA World Cup, hosted by 3 nations: USA, Canada, and Mexico...</p>
<!-- Add more creative content here if you want :)-->
```

### Development Workflow
1. Create your feature branch with your name
2. Make changes for the lab assignment
3. Test locally: `mvn spring-boot:run`
4. Commit your changes:
   ```bash
   git add .
   git commit -m "Lab 1: Implement About Controller"
   ```
5. Push to your fork:
   ```bash
   git push origin feature/lab-yourname
   ```
6. Create a pull request

## Resources
- **Thymeleaf Cheat Sheet:** Common Thymeleaf syntax and patterns (see `THYMELEAF_CHEATSHEET.md`)
- **Spring Boot Documentation**
- **Thymeleaf Official Docs**

## Thymeleaf Reference Quick Table

| Attribute | Purpose |
|---|---|
| `th:text` | Display variable (escaped HTML) |
| `th:utext` | Display variable (raw HTML) |
| `th:href` | Generate URLs |
| `th:src` | Bind image/resource URLs |
| `th:value` | Bind form input values |
| `th:each` | Loop through collections |
| `th:if` | Conditional rendering (true) |
| `th:unless` | Conditional rendering (false) |
| `th:switch`/`case` | Multiple conditions |
| `th:object` | Bind form to model object |
| `th:field` | Bind form input to model field |
| `th:errors` | Display field validation errors |
| `th:class` | Conditional CSS classes |
| `th:style` | Conditional inline styles |
| `th:with` | Define local variables |
| `th:insert` | Include fragment as child |
| `th:replace` | Replace element with fragment |

**Expressions:**
- `@{}` : URL expression
- `${}` : Variable expression
- `*{}` : Object variable expression
- `#{}` : Utility object expression
