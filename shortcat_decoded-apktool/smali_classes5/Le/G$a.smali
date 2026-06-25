.class final LLe/G$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLe/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:LXe/f;

.field private final b:LOe/g;


# direct methods
.method public constructor <init>(LXe/f;LOe/g;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LLe/G$a;->a:LXe/f;

    .line 10
    .line 11
    iput-object p2, p0, LLe/G$a;->b:LOe/g;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()LOe/g;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/G$a;->b:LOe/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LXe/f;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/G$a;->a:LXe/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, LLe/G$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LLe/G$a;->a:LXe/f;

    .line 6
    .line 7
    check-cast p1, LLe/G$a;

    .line 8
    .line 9
    iget-object p1, p1, LLe/G$a;->a:LXe/f;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LLe/G$a;->a:LXe/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LXe/f;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
