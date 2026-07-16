# javalearn Codebase Guide

An educational Java fundamentals project demonstrating OOP principles, exception handling, and collections API.

## Quick Start

**Compilation (Java 8+):**
```bash
javac assessment/ATM.java
javac assessment/CourseRegistrationSystem.java
javac assessment/EmployeeDemo.java
javac assessment/Main.java
javac assessment/ShoppingCart.java

# Run
java -cp assessment ATM
java -cp assessment CourseRegistrationSystem
java -cp assessment EmployeeDemo
java -cp assessment Main
```

## Project Structure

| File | Purpose | Key Concepts |
|------|---------|--------------|
| **ATM.java** | ATM withdrawal system with balance validation | Exception handling (ArithmeticException, InputMismatchException), try-catch |
| **CourseRegistrationSystem.java** | Course CRUD operations | Encapsulation, ArrayList, inner classes, method overloading |
| **EmployeeDemo.java** | Salary calculation hierarchy | Inheritance, polymorphism, method overriding |
| **Main.java** | Checkout system with error recovery | Exception handling, default values |
| **ShoppingCart.java** | ArrayList operations (incomplete teaching example) | Collections API, ArrayList methods, lambda expressions with `removeIf()` |

### Supporting Materials
- **class work/work.txt** — Exception handling guide with real-world scenarios and code examples

## Key Conventions

### Naming & Style
- Class names: **PascalCase** (e.g., `Employee`, `CourseRegistrationSystem`)
- Methods: **camelCase** (e.g., `calculateSalary()`, `showCourses()`)
- ⚠️ Inconsistency: Some files use package declarations (`classwork`), others use default package
- ⚠️ Documentation: Minimal JavaDoc; mostly inline comments

### Code Quality Issues
- **ShoppingCart.java** has compilation errors: duplicate variable `items`, missing `List` import, incomplete statements
  - These appear intentional for educational purposes
- Consider fixing before making modifications

### Design Patterns Used
- **Encapsulation**: Private fields with public accessors
- **Inheritance**: `Employee` → `Manager`/`Developer`/`Tester` hierarchy
- **Polymorphism**: Runtime method dispatch via overridden `calculateSalary()`
- **Collections**: ArrayList for dynamic data storage

## AI Agent Guidance

### Before any modifications:
1. Fix ShoppingCart.java compilation errors first
2. Use consistent package declarations (all files should be in `classwork` package)
3. Add `import java.util.List;` where needed

### When improving code:
- Standardize method naming (e.g., `addproduct()` → `addProduct()`)
- Add JavaDoc comments for public classes and methods
- Consider adding unit tests (JUnit) for CourseRegistrationSystem
- Ensure all exception handling follows consistent patterns

### Compilation & Testing
No build tools configured (Maven/Gradle) — direct javac compilation only. Consider suggesting Maven setup for future complexity.

## Related Documentation
See [class work/work.txt](class%20work/work.txt) for detailed exception handling concepts and real-world examples.
