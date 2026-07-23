import "./App.css";
import CourseDetails from "./CourseDetails";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";

function App() {
  return (
    <div className="container">
      <div className="card">
        <CourseDetails />
      </div>

      <div className="card">
        <BookDetails />
      </div>

      <div className="card">
        <BlogDetails />
      </div>
    </div>
  );
}

export default App;