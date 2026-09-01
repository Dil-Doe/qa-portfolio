# Functional Testing Checklist

## Authentication

- [ ] Login with valid credentials
- [ ] Login with invalid password
- [ ] Login with non-existent user
- [ ] Login with empty email
- [ ] Login with empty password
- [ ] Login with invalid email format
- [ ] Password is case-sensitive
- [ ] Logout from account
- [ ] Access protected page without authentication
- [ ] Access protected API without authentication
- [ ] Access protected API with invalid token

## Registration

- [ ] Registration with valid data
- [ ] Registration with existing email
- [ ] Registration with empty required fields
- [ ] Registration with invalid email format
- [ ] Registration with short password
- [ ] Registration with excessively long values
- [ ] Registration with leading/trailing spaces
- [ ] Validation messages are displayed correctly

## Product Catalog

- [ ] Open product catalog
- [ ] Open product details
- [ ] Product name is displayed correctly
- [ ] Product price is displayed correctly
- [ ] Product image is displayed correctly
- [ ] Search for existing product
- [ ] Search for non-existing product
- [ ] Search using partial product name
- [ ] Search using different letter case
- [ ] Search with empty value
- [ ] Apply available filters
- [ ] Remove filters
- [ ] Sort products
- [ ] Navigate between catalog pages
- [ ] Correct behaviour when no products are found

## Product Details

- [ ] Open product details from catalog
- [ ] Product information is displayed
- [ ] Product price matches catalog
- [ ] Add available product to cart
- [ ] Add the same product multiple times
- [ ] Handle unavailable product
- [ ] Return to product catalog

## Shopping Cart

- [ ] Add one product to cart
- [ ] Add multiple products to cart
- [ ] Add multiple different products
- [ ] Increase product quantity
- [ ] Decrease product quantity
- [ ] Remove product from cart
- [ ] Remove all products from cart
- [ ] Verify total price
- [ ] Refresh page with products in cart
- [ ] Try to set quantity to zero
- [ ] Try to set negative quantity
- [ ] Try to add unavailable quantity
- [ ] Verify cart after re-login

## Order Creation

- [ ] Create order with one product
- [ ] Create order with multiple products
- [ ] Verify order total
- [ ] Verify products included in order
- [ ] Verify product quantities
- [ ] Verify required customer fields
- [ ] Submit order with empty required fields
- [ ] Submit invalid customer data
- [ ] Try to create order with empty cart
- [ ] Prevent duplicate order submission
- [ ] Verify created order in order history

## Order History

- [ ] Open order history
- [ ] Display user's orders
- [ ] Open order details
- [ ] Verify order status
- [ ] Verify order total
- [ ] Verify order products
- [ ] Verify order belongs to current user
- [ ] Attempt to access another user's order

## User Profile

- [ ] Open profile
- [ ] Display current user information
- [ ] Edit profile information
- [ ] Save valid changes
- [ ] Submit invalid data
- [ ] Submit empty required fields
- [ ] Verify saved information after page refresh

## Authorization and Roles

- [ ] Regular user cannot access admin section
- [ ] Regular user cannot execute admin API operations
- [ ] Administrator can access admin section
- [ ] Administrator can manage products
- [ ] Administrator can view orders
- [ ] Administrator can manage users
- [ ] Direct access to restricted URL is denied
- [ ] API access is restricted according to user role

## API

- [ ] Verify successful GET request
- [ ] Verify successful POST request
- [ ] Verify successful PUT request
- [ ] Verify successful DELETE request
- [ ] Verify HTTP status codes
- [ ] Verify response structure
- [ ] Verify required response fields
- [ ] Verify invalid request parameters
- [ ] Verify missing required parameters
- [ ] Verify unauthorized requests
- [ ] Verify requests with invalid authentication
- [ ] Verify role-based access
- [ ] Compare API data with UI data

## Database

- [ ] Verify user creation in database
- [ ] Verify user data after update
- [ ] Verify order creation in database
- [ ] Verify order belongs to correct user
- [ ] Verify order items
- [ ] Verify product quantity
- [ ] Verify order total
- [ ] Verify relationships between entities
- [ ] Check for duplicate user emails
- [ ] Check for orphan records

## Regression

- [ ] Login
- [ ] Product catalog
- [ ] Product details
- [ ] Add product to cart
- [ ] Change cart quantity
- [ ] Remove product from cart
- [ ] Create order
- [ ] View order history
- [ ] User profile
- [ ] Authorization
- [ ] Critical API endpoints

## Exploratory Testing

- [ ] Refresh pages during important operations
- [ ] Use browser back/forward navigation
- [ ] Open the same functionality in multiple browser tabs
- [ ] Submit forms repeatedly
- [ ] Interrupt operations where possible
- [ ] Test unexpected input
- [ ] Check behaviour after session expiration
- [ ] Check behaviour after network interruption
