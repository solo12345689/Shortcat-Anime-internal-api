.class public final Lexpo/modules/image/okhttp/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY4/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/image/okhttp/a$a;
    }
.end annotation


# instance fields
.field private final a:Ldg/A;


# direct methods
.method public constructor <init>(Ldg/A;)V
    .locals 1

    .line 1
    const-string v0, "commonClient"

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
    iput-object p1, p0, Lexpo/modules/image/okhttp/a;->a:Ldg/A;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic c(LOb/b;JJZ)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lexpo/modules/image/okhttp/a;->g(LOb/b;JJZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(LOb/b;Ldg/v$a;)Ldg/E;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/image/okhttp/a;->f(LOb/b;Ldg/v$a;)Ldg/E;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final f(LOb/b;Ldg/v$a;)Ldg/E;
    .locals 3

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ldg/v$a;->z()Ldg/C;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Ldg/v$a;->a(Ldg/C;)Ldg/E;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Ldg/E;->Y()Ldg/E$a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Lv7/i;

    .line 19
    .line 20
    invoke-virtual {p1}, Ldg/E;->j()Ldg/F;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    new-instance v2, LOb/d;

    .line 27
    .line 28
    invoke-direct {v2, p0}, LOb/d;-><init>(LOb/b;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, p1, v2}, Lv7/i;-><init>(Ldg/F;Lv7/g;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ldg/E$a;->b(Ldg/F;)Ldg/E$a;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ldg/E$a;->c()Ldg/E;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    const-string p1, "Required value was null."

    .line 46
    .line 47
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0
.end method

.method private static final g(LOb/b;JJZ)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LOb/b;->b()LNb/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p5}, LNb/b;->a(JJZ)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, LOb/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lexpo/modules/image/okhttp/a;->h(LOb/b;)Z

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
    check-cast p1, LOb/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lexpo/modules/image/okhttp/a;->e(LOb/b;IILS4/h;)LY4/n$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public e(LOb/b;IILS4/h;)LY4/n$a;
    .locals 3

    .line 1
    const-string v0, "model"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "options"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/bumptech/glide/integration/okhttp3/a;

    .line 12
    .line 13
    iget-object v1, p0, Lexpo/modules/image/okhttp/a;->a:Ldg/A;

    .line 14
    .line 15
    invoke-virtual {v1}, Ldg/A;->F()Ldg/A$a;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, LOb/c;

    .line 20
    .line 21
    invoke-direct {v2, p1}, LOb/c;-><init>(LOb/b;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ldg/A$a;->a(Ldg/v;)Ldg/A$a;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ldg/A$a;->c()Ldg/A;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {v0, v1}, Lcom/bumptech/glide/integration/okhttp3/a;-><init>(Ldg/e$a;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, LOb/b;->a()LY4/h;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/bumptech/glide/integration/okhttp3/a;->c(LY4/h;IILS4/h;)LY4/n$a;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
.end method

.method public h(LOb/b;)Z
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
