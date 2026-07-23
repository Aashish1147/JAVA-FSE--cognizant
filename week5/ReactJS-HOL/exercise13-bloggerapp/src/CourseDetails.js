import { courses } from "./data";

function CourseDetails() {
  return (
    <>
      <h2>Course Details</h2>

      {courses.map(course => (
        <div key={course.id}>
          <h4>{course.name}</h4>
          <p>{course.date}</p>
        </div>
      ))}
    </>
  );
}

export default CourseDetails;