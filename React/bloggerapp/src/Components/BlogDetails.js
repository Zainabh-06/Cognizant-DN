import React from "react";

function BlogDetails(props) {

  const content =
    props.blogs.length > 0 ? (
      props.blogs.map((blog) => (
        <div key={blog.id}>
          <h2>{blog.title}</h2>
          <h4>{blog.author}</h4>
          <p>{blog.description}</p>
        </div>
      ))
    ) : (
      <h3>No Blogs Available</h3>
    );

  return (
    <div className="v1">
      <h1>Blog Details</h1>
      {content}
    </div>
  );
}

export default BlogDetails;