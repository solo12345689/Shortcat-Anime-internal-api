.class public abstract LXg/b;
.super LKg/a;


# instance fields
.field private b:LXg/c;


# direct methods
.method public constructor <init>(ZLXg/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LKg/a;-><init>(Z)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LXg/b;->b:LXg/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b()LXg/c;
    .locals 1

    .line 1
    iget-object v0, p0, LXg/b;->b:LXg/c;

    .line 2
    .line 3
    return-object v0
.end method
