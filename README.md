# PTLog Backend

## As user I'd like to see a list of blogs
GET /blogs : List<Blog>
## As user I'd like to see a blog
GET /blogs/{id} : Blog
## As user I'd like to see a list of posts
GET /blogs/{id}/posts : List<Post>
POST /blogs/{id}/posts : Post
DELETE /posts/{id} : Boolean




## As user I'd like to create an exercise
POST /exercise : Exercise

## As user I'd like to see a list of exercises
GET /exercises : List<Exercise>

## As user I'd like to see a single exercise
GET /exercise/{name} : Exercise

## As user I'd like to delete a single exercise
DELETE /exercise/{name} : Exercise

## As user I'd like to update a single exercise
PUT /exercise/{name} : Exercise


move
{
	id
	name
}

exercise
{
    name
    kg
    rep
}
