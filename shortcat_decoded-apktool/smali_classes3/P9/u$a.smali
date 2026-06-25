.class public final LP9/u$a;
.super LP9/s$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP9/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    .line 1
    invoke-direct {p0, v0}, LP9/u$a;-><init>(I)V

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LP9/s$a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)LP9/s$b;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public h(Ljava/lang/Object;)LP9/u$a;
    .locals 0

    .line 1
    invoke-super {p0, p1}, LP9/s$a;->d(Ljava/lang/Object;)LP9/s$a;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public varargs i([Ljava/lang/Object;)LP9/u$a;
    .locals 0

    .line 1
    invoke-super {p0, p1}, LP9/s$a;->e([Ljava/lang/Object;)LP9/s$b;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public j(Ljava/lang/Iterable;)LP9/u$a;
    .locals 0

    .line 1
    invoke-super {p0, p1}, LP9/s$a;->b(Ljava/lang/Iterable;)LP9/s$b;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public k()LP9/u;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LP9/s$a;->c:Z

    .line 3
    .line 4
    iget-object v0, p0, LP9/s$a;->a:[Ljava/lang/Object;

    .line 5
    .line 6
    iget v1, p0, LP9/s$a;->b:I

    .line 7
    .line 8
    invoke-static {v0, v1}, LP9/u;->s([Ljava/lang/Object;I)LP9/u;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method
