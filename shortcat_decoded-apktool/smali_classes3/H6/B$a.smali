.class public final LH6/B$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH6/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:LH6/E;

.field private b:LH6/F;

.field private c:LH6/E;

.field private d:LB5/d;

.field private e:LH6/E;

.field private f:LH6/F;

.field private g:LH6/E;

.field private h:LH6/F;

.field private i:Ljava/lang/String;

.field private j:I

.field private k:I

.field private l:Z

.field public m:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LH6/C;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LH6/B$a;-><init>()V

    return-void
.end method

.method static bridge synthetic a(LH6/B$a;)I
    .locals 0

    .line 1
    iget p0, p0, LH6/B$a;->k:I

    .line 2
    .line 3
    return p0
.end method

.method static bridge synthetic b(LH6/B$a;)I
    .locals 0

    .line 1
    iget p0, p0, LH6/B$a;->j:I

    .line 2
    .line 3
    return p0
.end method

.method static bridge synthetic c(LH6/B$a;)LH6/E;
    .locals 0

    .line 1
    iget-object p0, p0, LH6/B$a;->a:LH6/E;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic d(LH6/B$a;)LH6/F;
    .locals 0

    .line 1
    iget-object p0, p0, LH6/B$a;->b:LH6/F;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic e(LH6/B$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, LH6/B$a;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic f(LH6/B$a;)LH6/E;
    .locals 0

    .line 1
    iget-object p0, p0, LH6/B$a;->c:LH6/E;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic g(LH6/B$a;)LH6/E;
    .locals 0

    .line 1
    iget-object p0, p0, LH6/B$a;->e:LH6/E;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic h(LH6/B$a;)LH6/F;
    .locals 0

    .line 1
    iget-object p0, p0, LH6/B$a;->f:LH6/F;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic i(LH6/B$a;)LB5/d;
    .locals 0

    .line 1
    iget-object p0, p0, LH6/B$a;->d:LB5/d;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic j(LH6/B$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LH6/B$a;->l:Z

    .line 2
    .line 3
    return p0
.end method

.method static bridge synthetic k(LH6/B$a;)LH6/E;
    .locals 0

    .line 1
    iget-object p0, p0, LH6/B$a;->g:LH6/E;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic l(LH6/B$a;)LH6/F;
    .locals 0

    .line 1
    iget-object p0, p0, LH6/B$a;->h:LH6/F;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public m()LH6/B;
    .locals 2

    .line 1
    new-instance v0, LH6/B;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LH6/B;-><init>(LH6/B$a;LH6/C;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
