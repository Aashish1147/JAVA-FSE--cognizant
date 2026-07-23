import { books } from "./data";

function BookDetails() {
  return (
    <>
      <h2>Book Details</h2>

      {books.map(book => (
        <div key={book.id}>
          <h4>{book.name}</h4>
          <p>{book.price}</p>
        </div>
      ))}
    </>
  );
}

export default BookDetails;