.class abstract Lfe/o;
.super Lfe/n;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static q(Ljava/io/File;Lfe/j;)Lfe/i;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "direction"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lfe/i;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lfe/i;-><init>(Ljava/io/File;Lfe/j;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static final r(Ljava/io/File;)Lfe/i;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lfe/j;->b:Lfe/j;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lfe/o;->q(Ljava/io/File;Lfe/j;)Lfe/i;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static s(Ljava/io/File;)Lfe/i;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lfe/j;->a:Lfe/j;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lfe/o;->q(Ljava/io/File;Lfe/j;)Lfe/i;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
