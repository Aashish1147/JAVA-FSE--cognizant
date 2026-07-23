import { blogs } from "./data";

function BlogDetails() {
  return (
    <>
      <h2>Blog Details</h2>

      {blogs.map(blog => (
        <div key={blog.id}>
          <h4>{blog.title}</h4>
          <strong>{blog.author}</strong>
          <p>{blog.content}</p>
        </div>
      ))}
    </>
  );
}

export default BlogDetails;