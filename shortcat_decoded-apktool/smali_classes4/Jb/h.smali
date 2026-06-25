.class public final LJb/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY4/n;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, LJb/h;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method private final f(Landroid/net/Uri;ILjava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "getPathSegments(...)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1, p2}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/lang/String;

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    return-object p3

    .line 19
    :cond_0
    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, LJb/f;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LJb/h;->g(LJb/f;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILS4/h;)LY4/n$a;
    .locals 0

    .line 1
    check-cast p1, LJb/f;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, LJb/h;->d(LJb/f;IILS4/h;)LY4/n$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d(LJb/f;IILS4/h;)LY4/n$a;
    .locals 3

    .line 1
    const-string p2, "model"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "options"

    .line 7
    .line 8
    invoke-static {p4, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, LJb/f;->b()Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    new-instance p3, LJb/g;

    .line 16
    .line 17
    invoke-direct {p3}, LJb/g;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 p4, 0x0

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, p2, p4, v0, p3}, LJb/h;->f(Landroid/net/Uri;ILjava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, Ljava/lang/String;

    .line 27
    .line 28
    new-instance p3, LY4/n$a;

    .line 29
    .line 30
    new-instance p4, Ln5/c;

    .line 31
    .line 32
    invoke-direct {p4, p1}, Ln5/c;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, LJb/a;

    .line 36
    .line 37
    invoke-virtual {p1}, LJb/f;->c()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {p1}, LJb/f;->a()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    const/high16 v2, 0x3f800000    # 1.0f

    .line 46
    .line 47
    invoke-direct {v0, p2, v1, p1, v2}, LJb/a;-><init>(Ljava/lang/String;IIF)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p3, p4, v0}, LY4/n$a;-><init>(LS4/f;Lcom/bumptech/glide/load/data/d;)V

    .line 51
    .line 52
    .line 53
    return-object p3
.end method

.method public g(LJb/f;)Z
    .locals 1

    .line 1
    const-string v0, "model"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1
.end method
