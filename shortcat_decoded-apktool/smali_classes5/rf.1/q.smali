.class public final Lrf/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lrf/p;


# instance fields
.field private final c:Lrf/g;

.field private final d:Lrf/f;

.field private final e:Lbf/o;


# direct methods
.method public constructor <init>(Lrf/g;Lrf/f;)V
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypePreparator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lrf/q;->c:Lrf/g;

    .line 3
    iput-object p2, p0, Lrf/q;->d:Lrf/f;

    .line 4
    invoke-virtual {p0}, Lrf/q;->d()Lrf/g;

    move-result-object p1

    invoke-static {p1}, Lbf/o;->m(Lrf/g;)Lbf/o;

    move-result-object p1

    const-string p2, "createWithTypeRefiner(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lrf/q;->e:Lbf/o;

    return-void
.end method

.method public synthetic constructor <init>(Lrf/g;Lrf/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 5
    sget-object p2, Lrf/f$a;->a:Lrf/f$a;

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lrf/q;-><init>(Lrf/g;Lrf/f;)V

    return-void
.end method


# virtual methods
.method public a(Lqf/S;Lqf/S;)Z
    .locals 8

    .line 1
    const-string v0, "subtype"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "supertype"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lrf/q;->d()Lrf/g;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {p0}, Lrf/q;->f()Lrf/f;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v6, 0x6

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v1, 0x1

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v7}, Lrf/a;->b(ZZLrf/b;Lrf/f;Lrf/g;ILjava/lang/Object;)Lqf/u0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1}, Lqf/S;->Q0()Lqf/M0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p2}, Lqf/S;->Q0()Lqf/M0;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p0, v0, p1, p2}, Lrf/q;->g(Lqf/u0;Lqf/M0;Lqf/M0;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1
.end method

.method public b()Lbf/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lrf/q;->e:Lbf/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(Lqf/S;Lqf/S;)Z
    .locals 8

    .line 1
    const-string v0, "a"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "b"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lrf/q;->d()Lrf/g;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {p0}, Lrf/q;->f()Lrf/f;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v6, 0x6

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v7}, Lrf/a;->b(ZZLrf/b;Lrf/f;Lrf/g;ILjava/lang/Object;)Lqf/u0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1}, Lqf/S;->Q0()Lqf/M0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p2}, Lqf/S;->Q0()Lqf/M0;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p0, v0, p1, p2}, Lrf/q;->e(Lqf/u0;Lqf/M0;Lqf/M0;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1
.end method

.method public d()Lrf/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lrf/q;->c:Lrf/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(Lqf/u0;Lqf/M0;Lqf/M0;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "a"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "b"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lqf/g;->a:Lqf/g;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2, p3}, Lqf/g;->m(Lqf/u0;Luf/i;Luf/i;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method

.method public f()Lrf/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lrf/q;->d:Lrf/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g(Lqf/u0;Lqf/M0;Lqf/M0;)Z
    .locals 8

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "subType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "superType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lqf/g;->a:Lqf/g;

    .line 17
    .line 18
    const/16 v6, 0x8

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    move-object v2, p1

    .line 23
    move-object v3, p2

    .line 24
    move-object v4, p3

    .line 25
    invoke-static/range {v1 .. v7}, Lqf/g;->v(Lqf/g;Lqf/u0;Luf/i;Luf/i;ZILjava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
.end method
