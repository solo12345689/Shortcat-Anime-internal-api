.class final LWf/d$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LTf/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWf/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field public static final b:LWf/d$a;

.field private static final c:Ljava/lang/String;


# instance fields
.field private final synthetic a:LTf/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LWf/d$a;

    .line 2
    .line 3
    invoke-direct {v0}, LWf/d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LWf/d$a;->b:LWf/d$a;

    .line 7
    .line 8
    const-string v0, "kotlinx.serialization.json.JsonArray"

    .line 9
    .line 10
    sput-object v0, LWf/d$a;->c:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LWf/q;->a:LWf/q;

    .line 5
    .line 6
    invoke-static {v0}, LSf/a;->g(LRf/b;)LRf/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, LRf/b;->getDescriptor()LTf/e;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, LWf/d$a;->a:LTf/e;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public getAnnotations()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LWf/d$a;->a:LTf/e;

    .line 2
    .line 3
    invoke-interface {v0}, LTf/e;->getAnnotations()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public h()LTf/l;
    .locals 1

    .line 1
    iget-object v0, p0, LWf/d$a;->a:LTf/e;

    .line 2
    .line 3
    invoke-interface {v0}, LTf/e;->h()LTf/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-object v0, p0, LWf/d$a;->a:LTf/e;

    .line 2
    .line 3
    invoke-interface {v0}, LTf/e;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isInline()Z
    .locals 1

    .line 1
    iget-object v0, p0, LWf/d$a;->a:LTf/e;

    .line 2
    .line 3
    invoke-interface {v0}, LTf/e;->isInline()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
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
    iget-object v0, p0, LWf/d$a;->a:LTf/e;

    .line 7
    .line 8
    invoke-interface {v0, p1}, LTf/e;->j(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public k()I
    .locals 1

    .line 1
    iget-object v0, p0, LWf/d$a;->a:LTf/e;

    .line 2
    .line 3
    invoke-interface {v0}, LTf/e;->k()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public l(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LWf/d$a;->a:LTf/e;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LTf/e;->l(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public m(I)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LWf/d$a;->a:LTf/e;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LTf/e;->m(I)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public n(I)LTf/e;
    .locals 1

    .line 1
    iget-object v0, p0, LWf/d$a;->a:LTf/e;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LTf/e;->n(I)LTf/e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LWf/d$a;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public p(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, LWf/d$a;->a:LTf/e;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LTf/e;->p(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
