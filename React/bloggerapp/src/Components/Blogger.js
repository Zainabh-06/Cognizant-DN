import React from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

import { books, blogs, courses } from "../Data";

function Blogger() {

  let show = true;

  if (!show) {
    return <h2>Nothing to Display</h2>;
  }

  return (
    <div className="container">

      <CourseDetails courses={courses} />

      <BookDetails books={books} />

      <BlogDetails blogs={blogs} />

    </div>
  );
}

export default Blogger;