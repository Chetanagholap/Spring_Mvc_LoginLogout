<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Student Dashboard</title>
  <link rel="stylesheet" href="styles.css">
</head>
<body>
  <div class="dashboard-container">
    <!-- Sidebar -->
    <nav class="sidebar">
      <h2>Dashboard</h2>
      <ul>
        <li><a href="#">Home</a></li>
        <li><a href="#">Courses</a></li>
        <li><a href="#">Assignments</a></li>
        <li><a href="#">Grades</a></li>
        <li><a href="#">Profile</a></li>
        <li><a href="logout">Logout</a></li>
      </ul>
    </nav>

    <!-- Main Content -->
    <main class="main-content">
      <header class="dashboard-header">
        <h1>Welcome, Student!</h1>
      </header>

      <section class="dashboard-info">
        <div class="info-box">
          <h3>Recent Activities</h3>
          <ul>
            <li>Submitted Assignment 1 for Math</li>
            <li>Completed Module 2 in Science</li>
            <li>Graded: History Assignment - 95%</li>
          </ul>
        </div>

        <div class="info-box">
          <h3>Upcoming Deadlines</h3>
          <ul>
            <li>Math Quiz: Sept 25, 2024</li>
            <li>Science Project: Sept 30, 2024</li>
            <li>English Essay: Oct 3, 2024</li>
          </ul>
        </div>

        <div class="info-box">
          <h3>Current Grades</h3>
          <ul>
            <li>Math: 85%</li>
            <li>Science: 90%</li>
            <li>English: 88%</li>
          </ul>
        </div>
      </section>
    </main>
  </div>
</body>
</html>
<style>

* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}

body {
  font-family: Arial, sans-serif;
  background-color: #f4f4f4;
}

.dashboard-container {
  display: flex;
  height: 100vh;
}

/* Sidebar */
.sidebar {
  background-color: #343a40;
  color: white;
  width: 250px;
  padding: 20px;
  display: flex;
  flex-direction: column;
}

.sidebar h2 {
  margin-bottom: 20px;
  text-align: center;
}

.sidebar ul {
  list-style-type: none;
  padding: 0;
}

.sidebar ul li {
  margin: 10px 0;
}

.sidebar ul li a {
  color: white;
  text-decoration: none;
  font-size: 16px;
  display: block;
  padding: 10px;
  border-radius: 5px;
}

.sidebar ul li a:hover {
  background-color: #495057;
}

/* Main Content */
.main-content {
  flex-grow: 1;
  padding: 20px;
}

.dashboard-header {
  background-color: #007bff;
  color: white;
  padding: 15px;
  border-radius: 5px;
  margin-bottom: 20px;
  text-align: center;
}

.dashboard-info {
  display: flex;
  gap: 20px;
  flex-wrap: wrap;
}

.info-box {
  background-color: white;
  padding: 20px;
  border-radius: 5px;
  width: 100%;
  max-width: 300px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.info-box h3 {
  margin-bottom: 15px;
}

.info-box ul {
  list-style-type: none;
}

.info-box ul li {
  margin-bottom: 10px;
}

/* Responsive Design */
@media (max-width: 768px) {
  .dashboard-container {
    flex-direction: column;
  }

  .sidebar {
    width: 100%;
    text-align: center;
  }

  .main-content {
    padding: 10px;
  }

  .dashboard-info {
    flex-direction: column;
  }
}

</style>