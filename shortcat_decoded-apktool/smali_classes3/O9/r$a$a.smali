.class LO9/r$a$a;
.super LO9/r$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO9/r$a;->b(LO9/r;Ljava/lang/CharSequence;)LO9/r$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic h:LO9/r$a;


# direct methods
.method constructor <init>(LO9/r$a;LO9/r;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO9/r$a$a;->h:LO9/r$a;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, LO9/r$b;-><init>(LO9/r;Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method f(I)I
    .locals 0

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    return p1
.end method

.method g(I)I
    .locals 2

    .line 1
    iget-object v0, p0, LO9/r$a$a;->h:LO9/r$a;

    .line 2
    .line 3
    iget-object v0, v0, LO9/r$a;->a:LO9/d;

    .line 4
    .line 5
    iget-object v1, p0, LO9/r$b;->c:Ljava/lang/CharSequence;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, LO9/d;->c(Ljava/lang/CharSequence;I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
