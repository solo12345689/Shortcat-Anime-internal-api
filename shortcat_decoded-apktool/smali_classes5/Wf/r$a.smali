.class public final LWf/r$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LTf/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWf/r;->f(Lie/a;)LTf/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Lkotlin/Lazy;


# direct methods
.method constructor <init>(Lie/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, LWf/r$a;->a:Lkotlin/Lazy;

    .line 9
    .line 10
    return-void
.end method

.method private final a()LTf/e;
    .locals 1

    .line 1
    iget-object v0, p0, LWf/r$a;->a:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LTf/e;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getAnnotations()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, LTf/e$a;->a(LTf/e;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h()LTf/l;
    .locals 1

    .line 1
    invoke-direct {p0}, LWf/r$a;->a()LTf/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LTf/e;->h()LTf/l;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public i()Z
    .locals 1

    .line 1
    invoke-static {p0}, LTf/e$a;->c(LTf/e;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public isInline()Z
    .locals 1

    .line 1
    invoke-static {p0}, LTf/e$a;->b(LTf/e;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public j(Ljava/lang/String;)I
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LWf/r$a;->a()LTf/e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0, p1}, LTf/e;->j(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public k()I
    .locals 1

    .line 1
    invoke-direct {p0}, LWf/r$a;->a()LTf/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LTf/e;->k()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public l(I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, LWf/r$a;->a()LTf/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, LTf/e;->l(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public m(I)Ljava/util/List;
    .locals 1

    .line 1
    invoke-direct {p0}, LWf/r$a;->a()LTf/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, LTf/e;->m(I)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public n(I)LTf/e;
    .locals 1

    .line 1
    invoke-direct {p0}, LWf/r$a;->a()LTf/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, LTf/e;->n(I)LTf/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, LWf/r$a;->a()LTf/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LTf/e;->o()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public p(I)Z
    .locals 1

    .line 1
    invoke-direct {p0}, LWf/r$a;->a()LTf/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, LTf/e;->p(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
