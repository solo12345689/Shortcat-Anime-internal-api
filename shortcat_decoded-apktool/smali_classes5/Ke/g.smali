.class public final LKe/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lze/h;


# instance fields
.field private final a:LKe/k;

.field private final b:LOe/d;

.field private final c:Z

.field private final d:Lpf/h;


# direct methods
.method public constructor <init>(LKe/k;LOe/d;Z)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LKe/g;->a:LKe/k;

    .line 3
    iput-object p2, p0, LKe/g;->b:LOe/d;

    .line 4
    iput-boolean p3, p0, LKe/g;->c:Z

    .line 5
    invoke-virtual {p1}, LKe/k;->a()LKe/d;

    move-result-object p1

    invoke-virtual {p1}, LKe/d;->u()Lpf/n;

    move-result-object p1

    new-instance p2, LKe/f;

    invoke-direct {p2, p0}, LKe/f;-><init>(LKe/g;)V

    invoke-interface {p1, p2}, Lpf/n;->d(Lkotlin/jvm/functions/Function1;)Lpf/h;

    move-result-object p1

    iput-object p1, p0, LKe/g;->d:Lpf/h;

    return-void
.end method

.method public synthetic constructor <init>(LKe/k;LOe/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, LKe/g;-><init>(LKe/k;LOe/d;Z)V

    return-void
.end method

.method static synthetic b(LKe/g;LOe/a;)Lze/c;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LKe/g;->d(LKe/g;LOe/a;)Lze/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final d(LKe/g;LOe/a;)Lze/c;
    .locals 2

    .line 1
    const-string v0, "annotation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LIe/d;->a:LIe/d;

    .line 7
    .line 8
    iget-object v1, p0, LKe/g;->a:LKe/k;

    .line 9
    .line 10
    iget-boolean p0, p0, LKe/g;->c:Z

    .line 11
    .line 12
    invoke-virtual {v0, p1, v1, p0}, LIe/d;->e(LOe/a;LKe/k;Z)Lze/c;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public h(LXe/c;)Lze/c;
    .locals 3

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LKe/g;->b:LOe/d;

    .line 7
    .line 8
    invoke-interface {v0, p1}, LOe/d;->h(LXe/c;)LOe/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, LKe/g;->d:Lpf/h;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lze/c;

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-object v0

    .line 26
    :cond_1
    :goto_0
    sget-object v0, LIe/d;->a:LIe/d;

    .line 27
    .line 28
    iget-object v1, p0, LKe/g;->b:LOe/d;

    .line 29
    .line 30
    iget-object v2, p0, LKe/g;->a:LKe/k;

    .line 31
    .line 32
    invoke-virtual {v0, p1, v1, v2}, LIe/d;->a(LXe/c;LOe/d;LKe/k;)Lze/c;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, LKe/g;->b:LOe/d;

    .line 2
    .line 3
    invoke-interface {v0}, LOe/d;->getAnnotations()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LKe/g;->b:LOe/d;

    .line 14
    .line 15
    invoke-interface {v0}, LOe/d;->D()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 5

    .line 1
    iget-object v0, p0, LKe/g;->b:LOe/d;

    .line 2
    .line 3
    invoke-interface {v0}, LOe/d;->getAnnotations()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-static {v0}, LUd/u;->c0(Ljava/lang/Iterable;)LCf/i;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, LKe/g;->d:Lpf/h;

    .line 14
    .line 15
    invoke-static {v0, v1}, LCf/l;->K(LCf/i;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, LIe/d;->a:LIe/d;

    .line 20
    .line 21
    sget-object v2, Lve/o$a;->y:LXe/c;

    .line 22
    .line 23
    iget-object v3, p0, LKe/g;->b:LOe/d;

    .line 24
    .line 25
    iget-object v4, p0, LKe/g;->a:LKe/k;

    .line 26
    .line 27
    invoke-virtual {v1, v2, v3, v4}, LIe/d;->a(LXe/c;LOe/d;LKe/k;)Lze/c;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, v1}, LCf/l;->O(LCf/i;Ljava/lang/Object;)LCf/i;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, LCf/l;->B(LCf/i;)LCf/i;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, LCf/i;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0
.end method

.method public k0(LXe/c;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lze/h$b;->b(Lze/h;LXe/c;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
