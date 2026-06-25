.class public final LOb/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LY4/h;

.field private b:LNb/b;


# direct methods
.method public constructor <init>(LY4/h;)V
    .locals 1

    .line 1
    const-string v0, "glideUrl"

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
    iput-object p1, p0, LOb/b;->a:LY4/h;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()LY4/h;
    .locals 1

    .line 1
    iget-object v0, p0, LOb/b;->a:LY4/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LNb/b;
    .locals 1

    .line 1
    iget-object v0, p0, LOb/b;->b:LNb/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LNb/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LOb/b;->b:LNb/b;

    .line 2
    .line 3
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LOb/b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, LOb/b;

    .line 12
    .line 13
    iget-object v1, p0, LOb/b;->a:LY4/h;

    .line 14
    .line 15
    iget-object p1, p1, LOb/b;->a:LY4/h;

    .line 16
    .line 17
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LOb/b;->a:LY4/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LY4/h;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, LOb/b;->a:LY4/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LY4/h;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "toString(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
