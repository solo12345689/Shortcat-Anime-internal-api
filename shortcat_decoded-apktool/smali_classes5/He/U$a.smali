.class public final LHe/U$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHe/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LHe/U$a$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LHe/U$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LHe/U$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LHe/U$a$a;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LHe/U$a;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LHe/U$a$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LHe/U$a$a;
    .locals 2

    .line 1
    new-instance v0, LHe/U$a$a;

    .line 2
    .line 3
    invoke-static {p2}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const-string v1, "identifier(...)"

    .line 8
    .line 9
    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p1, p2, p3, p4}, LHe/U$a$a;-><init>(Ljava/lang/String;LXe/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method


# virtual methods
.method public final b(LXe/f;)LXe/f;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LHe/U$a;->f()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, LXe/f;

    .line 15
    .line 16
    return-object p1
.end method

.method public final c()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {}, LHe/U;->a()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final d()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-static {}, LHe/U;->b()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final e()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-static {}, LHe/U;->c()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final f()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-static {}, LHe/U;->d()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final g()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-static {}, LHe/U;->e()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final h()LHe/U$a$a;
    .locals 1

    .line 1
    invoke-static {}, LHe/U;->f()LHe/U$a$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final i()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-static {}, LHe/U;->g()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final j()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-static {}, LHe/U;->h()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final k(LXe/f;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LHe/U$a;->g()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final l(Ljava/lang/String;)LHe/U$b;
    .locals 1

    .line 1
    const-string v0, "builtinSignature"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LHe/U$a;->c()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sget-object p1, LHe/U$b;->c:LHe/U$b;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    invoke-virtual {p0}, LHe/U$a;->i()Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0, p1}, LUd/S;->j(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, LHe/U$c;

    .line 28
    .line 29
    sget-object v0, LHe/U$c;->b:LHe/U$c;

    .line 30
    .line 31
    if-ne p1, v0, :cond_1

    .line 32
    .line 33
    sget-object p1, LHe/U$b;->e:LHe/U$b;

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_1
    sget-object p1, LHe/U$b;->d:LHe/U$b;

    .line 37
    .line 38
    return-object p1
.end method
