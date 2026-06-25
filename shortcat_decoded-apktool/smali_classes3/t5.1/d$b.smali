.class public final Lt5/d$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ly5/n;

.field private d:J

.field private e:J

.field private f:J

.field private g:Lt5/j;

.field private h:Ls5/a;

.field private i:Ls5/c;

.field private j:Lv5/b;

.field private k:Z

.field private final l:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lt5/d$b;->a:I

    .line 4
    const-string v0, "image_cache"

    iput-object v0, p0, Lt5/d$b;->b:Ljava/lang/String;

    const-wide/32 v0, 0x2800000

    .line 5
    iput-wide v0, p0, Lt5/d$b;->d:J

    const-wide/32 v0, 0xa00000

    .line 6
    iput-wide v0, p0, Lt5/d$b;->e:J

    const-wide/32 v0, 0x200000

    .line 7
    iput-wide v0, p0, Lt5/d$b;->f:J

    .line 8
    new-instance v0, Lt5/c;

    invoke-direct {v0}, Lt5/c;-><init>()V

    iput-object v0, p0, Lt5/d$b;->g:Lt5/j;

    .line 9
    iput-object p1, p0, Lt5/d$b;->l:Landroid/content/Context;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lt5/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lt5/d$b;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method static bridge synthetic a(Lt5/d$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lt5/d$b;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic b(Lt5/d$b;)Ly5/n;
    .locals 0

    .line 1
    iget-object p0, p0, Lt5/d$b;->c:Ly5/n;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic c(Lt5/d$b;)Ls5/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lt5/d$b;->h:Ls5/a;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic d(Lt5/d$b;)Ls5/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lt5/d$b;->i:Ls5/c;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic e(Lt5/d$b;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lt5/d$b;->l:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic f(Lt5/d$b;)Lv5/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lt5/d$b;->j:Lv5/b;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic g(Lt5/d$b;)Lt5/j;
    .locals 0

    .line 1
    iget-object p0, p0, Lt5/d$b;->g:Lt5/j;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic h(Lt5/d$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lt5/d$b;->k:Z

    .line 2
    .line 3
    return p0
.end method

.method static bridge synthetic i(Lt5/d$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lt5/d$b;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static bridge synthetic j(Lt5/d$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lt5/d$b;->e:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static bridge synthetic k(Lt5/d$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lt5/d$b;->f:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static bridge synthetic l(Lt5/d$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lt5/d$b;->a:I

    .line 2
    .line 3
    return p0
.end method

.method static bridge synthetic m(Lt5/d$b;Ly5/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt5/d$b;->c:Ly5/n;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public n()Lt5/d;
    .locals 1

    .line 1
    new-instance v0, Lt5/d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lt5/d;-><init>(Lt5/d$b;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
