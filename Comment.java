public class Comment {
        private long id;
        private long userId;
        private long replyTo;
        private String name;
        private String content;

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public long getUserId() {
                return userId;
        }

        public void setUserId(long userId) {
                this.userId = userId;
        }

        public long getReplyTo() {
                return replyTo;
        }

        public void setReplyTo(long replyTo) {
                this.replyTo = replyTo;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getContent() {
                return content;
        }

        public void setContent(String content) {
                this.content = content;
        }
}