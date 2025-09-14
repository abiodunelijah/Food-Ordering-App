# 🍕 Food Ordering App

A modern, responsive food ordering application that allows users to browse restaurants, view menus, add items to cart, and place orders seamlessly.


## ✨ Features

### User Features
- **Restaurant Browsing**: View list of available restaurants with ratings and cuisine types
- **Menu Navigation**: Browse restaurant menus with detailed food descriptions and prices
- **Search & Filter**: Search for specific dishes or filter by categories (vegetarian, non-vegetarian, etc.)
- **Shopping Cart**: Add/remove items, adjust quantities, and view total cost
- **User Authentication**: Secure login and registration system
- **Order Tracking**: Real-time order status updates
- **Payment Integration**: Secure payment processing
- **Order History**: View past orders and reorder favorites
- **Reviews & Ratings**: Rate restaurants and dishes

### Admin Features
- **Restaurant Management**: Add, edit, and remove restaurants
- **Menu Management**: Manage food items, prices, and availability
- **Order Management**: View and update order statuses
- **User Management**: Monitor user accounts and activity
- **Analytics Dashboard**: View sales statistics and popular items

## 🎯 Live Demo
_ 

## 🛠 Technologies Used

### Frontend
- **React.js** - UI library for building user interfaces
- **Redux/Context API** - State management
- **React Router** - Client-side routing
- **Axios** - HTTP client for API requests
- **CSS3/SCSS** - Styling and animations
- **Bootstrap/Material-UI** - Component library

### Backend
- **Java 21** - Programming language with latest LTS features
- **Spring Boot 3.5** - Java framework for building production-ready applications
- **Spring Framework 6** - Core Spring framework
- **Spring Security 6** - Authentication and authorization
- **Spring Data JPA 3.5** - Data access layer with JPA 3.1 support
- **Spring Web 6** - RESTful web services with enhanced WebMVC
- **PostgreSQL 17.4** - Advanced relational database with latest features
- **Hibernate 6.x** - Object-relational mapping (ORM) with Jakarta EE support
- **JWT** - JSON Web Token for stateless authentication
- **BCrypt** - Password encoding
- **Maven 3.9** - Build automation tool

### Additional Tools
- **WebSocket/STOMP** - Real-time communication with Spring WebSocket
- **Spring Boot Actuator** - Production monitoring and management
- **Stripe** - Payment processing integration
- **JavaMail API** - Email service with Spring Boot Starter Mail
- **Cloudinary/AWS S3** - Image storage and CDN
- **Swagger/OpenAPI 3** - API documentation with springdoc-openapi
- **Spring Boot DevTools** - Development productivity tools
- **Testcontainers** - Integration testing with real databases

## 🚀 Installation

### Prerequisites
- Java JDK 21 (LTS)
- Maven 3.9+
- PostgreSQL 17.4
- Node.js (v18 or higher) for frontend
- npm or yarn
- Git

## 📱 Usage

1. **User Registration/Login**
   - Create a new account or login with existing credentials
   - Email verification may be required

2. **Browse Restaurants**
   - View available restaurants in your area
   - Filter by cuisine type, ratings, or delivery time

3. **Order Food**
   - Select a restaurant and browse their menu
   - Add items to cart and customize orders
   - Proceed to checkout and complete payment

4. **Track Orders**
   - Monitor order status in real-time
   - Receive notifications about order updates

## 🔗 API Endpoints

### Authentication
- `POST /api/auth/register` - User registration
- `POST /api/auth/login` - User login
- `POST /api/auth/logout` - User logout
- `GET /api/auth/profile` - Get user profile

### Restaurants
- `GET /api/restaurants` - Get all restaurants
- `GET /api/restaurants/:id` - Get restaurant details
- `GET /api/restaurants/:id/menu` - Get restaurant menu

### Orders
- `POST /api/orders` - Create new order
- `GET /api/orders` - Get user orders
- `GET /api/orders/:id` - Get specific order
- `PUT /api/orders/:id/status` - Update order status

### Cart
- `POST /api/cart/add` - Add item to cart
- `GET /api/cart` - Get cart items
- `PUT /api/cart/:id` - Update cart item
- `DELETE /api/cart/:id` - Remove cart item

## 📁 Project Structure

```
Food-Ordering-App/
│
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── foodordering/
│   │   │   │           ├── FoodOrderingApplication.java
│   │   │   │           ├── config/
│   │   │   │           │   ├── SecurityConfig.java
│   │   │   │           │   ├── JwtConfig.java
│   │   │   │           │   └── WebConfig.java
│   │   │   │           ├── controller/
│   │   │   │           │   ├── AuthController.java
│   │   │   │           │   ├── RestaurantController.java
│   │   │   │           │   ├── OrderController.java
│   │   │   │           │   └── CartController.java
│   │   │   │           ├── dto/
│   │   │   │           │   ├── UserDTO.java
│   │   │   │           │   ├── RestaurantDTO.java
│   │   │   │           │   └── OrderDTO.java
│   │   │   │           ├── entity/
│   │   │   │           │   ├── User.java
│   │   │   │           │   ├── Restaurant.java
│   │   │   │           │   ├── MenuItem.java
│   │   │   │           │   ├── Order.java
│   │   │   │           │   └── OrderItem.java
│   │   │   │           ├── repository/
│   │   │   │           │   ├── UserRepository.java
│   │   │   │           │   ├── RestaurantRepository.java
│   │   │   │           │   └── OrderRepository.java
│   │   │   │           ├── service/
│   │   │   │           │   ├── UserService.java
│   │   │   │           │   ├── RestaurantService.java
│   │   │   │           │   ├── OrderService.java
│   │   │   │           │   └── EmailService.java
│   │   │   │           ├── security/
│   │   │   │           │   ├── JwtAuthenticationFilter.java
│   │   │   │           │   ├── JwtTokenProvider.java
│   │   │   │           │   └── CustomUserDetailsService.java
│   │   │   │           └── exception/
│   │   │   │               ├── GlobalExceptionHandler.java
│   │   │   │               └── CustomExceptions.java
│   │   │   └── resources/
│   │   │       ├── application.properties
│   │   │       ├── static/
│   │   │       └── templates/
│   │   └── test/
│   ├── pom.xml (or build.gradle)
│   └── target/
│
├── frontend/
│   ├── public/
│   ├── src/
│   │   ├── components/
│   │   │   ├── common/
│   │   │   ├── auth/
│   │   │   ├── restaurant/
│   │   │   └── cart/
│   │   ├── pages/
│   │   │   ├── Home.js
│   │   │   ├── Login.js
│   │   │   ├── Restaurant.js
│   │   │   └── Checkout.js
│   │   ├── context/
│   │   ├── services/
│   │   ├── utils/
│   │   ├── styles/
│   │   └── App.js
│   └── package.json
│
├── docs/
├── database/
│   ├── schema.sql
│   └── data.sql
├── README.md
└── pom.xml (or build.gradle)
```


