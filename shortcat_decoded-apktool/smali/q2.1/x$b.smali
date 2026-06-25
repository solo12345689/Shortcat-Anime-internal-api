.class public final Lq2/x$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private A:F

.field private B:[B

.field private C:I

.field private D:Lq2/l;

.field private E:I

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:I

.field private K:I

.field private L:I

.field private M:I

.field private N:I

.field private O:I

.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/util/List;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:Ljava/lang/String;

.field private k:Lq2/J;

.field private l:Ljava/lang/Object;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:I

.field private p:I

.field private q:Ljava/util/List;

.field private r:Lq2/q;

.field private s:J

.field private t:Z

.field private u:I

.field private v:I

.field private w:I

.field private x:I

.field private y:F

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, LP9/u;->A()LP9/u;

    move-result-object v0

    iput-object v0, p0, Lq2/x$b;->c:Ljava/util/List;

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lq2/x$b;->h:I

    .line 5
    iput v0, p0, Lq2/x$b;->i:I

    .line 6
    iput v0, p0, Lq2/x$b;->o:I

    .line 7
    iput v0, p0, Lq2/x$b;->p:I

    const-wide v1, 0x7fffffffffffffffL

    .line 8
    iput-wide v1, p0, Lq2/x$b;->s:J

    .line 9
    iput v0, p0, Lq2/x$b;->u:I

    .line 10
    iput v0, p0, Lq2/x$b;->v:I

    .line 11
    iput v0, p0, Lq2/x$b;->w:I

    .line 12
    iput v0, p0, Lq2/x$b;->x:I

    const/high16 v1, -0x40800000    # -1.0f

    .line 13
    iput v1, p0, Lq2/x$b;->y:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 14
    iput v1, p0, Lq2/x$b;->A:F

    .line 15
    iput v0, p0, Lq2/x$b;->C:I

    .line 16
    iput v0, p0, Lq2/x$b;->E:I

    .line 17
    iput v0, p0, Lq2/x$b;->F:I

    .line 18
    iput v0, p0, Lq2/x$b;->G:I

    .line 19
    iput v0, p0, Lq2/x$b;->H:I

    .line 20
    iput v0, p0, Lq2/x$b;->K:I

    const/4 v1, 0x1

    .line 21
    iput v1, p0, Lq2/x$b;->L:I

    .line 22
    iput v0, p0, Lq2/x$b;->M:I

    .line 23
    iput v0, p0, Lq2/x$b;->N:I

    const/4 v0, 0x0

    .line 24
    iput v0, p0, Lq2/x$b;->O:I

    .line 25
    iput v0, p0, Lq2/x$b;->g:I

    return-void
.end method

.method private constructor <init>(Lq2/x;)V
    .locals 2

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iget-object v0, p1, Lq2/x;->a:Ljava/lang/String;

    iput-object v0, p0, Lq2/x$b;->a:Ljava/lang/String;

    .line 28
    iget-object v0, p1, Lq2/x;->b:Ljava/lang/String;

    iput-object v0, p0, Lq2/x$b;->b:Ljava/lang/String;

    .line 29
    iget-object v0, p1, Lq2/x;->c:Ljava/util/List;

    iput-object v0, p0, Lq2/x$b;->c:Ljava/util/List;

    .line 30
    iget-object v0, p1, Lq2/x;->d:Ljava/lang/String;

    iput-object v0, p0, Lq2/x$b;->d:Ljava/lang/String;

    .line 31
    iget v0, p1, Lq2/x;->e:I

    iput v0, p0, Lq2/x$b;->e:I

    .line 32
    iget v0, p1, Lq2/x;->f:I

    iput v0, p0, Lq2/x$b;->f:I

    .line 33
    iget v0, p1, Lq2/x;->h:I

    iput v0, p0, Lq2/x$b;->h:I

    .line 34
    iget v0, p1, Lq2/x;->i:I

    iput v0, p0, Lq2/x$b;->i:I

    .line 35
    iget-object v0, p1, Lq2/x;->k:Ljava/lang/String;

    iput-object v0, p0, Lq2/x$b;->j:Ljava/lang/String;

    .line 36
    iget-object v0, p1, Lq2/x;->l:Lq2/J;

    iput-object v0, p0, Lq2/x$b;->k:Lq2/J;

    .line 37
    iget-object v0, p1, Lq2/x;->m:Ljava/lang/Object;

    iput-object v0, p0, Lq2/x$b;->l:Ljava/lang/Object;

    .line 38
    iget-object v0, p1, Lq2/x;->n:Ljava/lang/String;

    iput-object v0, p0, Lq2/x$b;->m:Ljava/lang/String;

    .line 39
    iget-object v0, p1, Lq2/x;->o:Ljava/lang/String;

    iput-object v0, p0, Lq2/x$b;->n:Ljava/lang/String;

    .line 40
    iget v0, p1, Lq2/x;->p:I

    iput v0, p0, Lq2/x$b;->o:I

    .line 41
    iget v0, p1, Lq2/x;->q:I

    iput v0, p0, Lq2/x$b;->p:I

    .line 42
    iget-object v0, p1, Lq2/x;->r:Ljava/util/List;

    iput-object v0, p0, Lq2/x$b;->q:Ljava/util/List;

    .line 43
    iget-object v0, p1, Lq2/x;->s:Lq2/q;

    iput-object v0, p0, Lq2/x$b;->r:Lq2/q;

    .line 44
    iget-wide v0, p1, Lq2/x;->t:J

    iput-wide v0, p0, Lq2/x$b;->s:J

    .line 45
    iget-boolean v0, p1, Lq2/x;->u:Z

    iput-boolean v0, p0, Lq2/x$b;->t:Z

    .line 46
    iget v0, p1, Lq2/x;->v:I

    iput v0, p0, Lq2/x$b;->u:I

    .line 47
    iget v0, p1, Lq2/x;->w:I

    iput v0, p0, Lq2/x$b;->v:I

    .line 48
    iget v0, p1, Lq2/x;->x:I

    iput v0, p0, Lq2/x$b;->w:I

    .line 49
    iget v0, p1, Lq2/x;->y:I

    iput v0, p0, Lq2/x$b;->x:I

    .line 50
    iget v0, p1, Lq2/x;->z:F

    iput v0, p0, Lq2/x$b;->y:F

    .line 51
    iget v0, p1, Lq2/x;->A:I

    iput v0, p0, Lq2/x$b;->z:I

    .line 52
    iget v0, p1, Lq2/x;->B:F

    iput v0, p0, Lq2/x$b;->A:F

    .line 53
    iget-object v0, p1, Lq2/x;->C:[B

    iput-object v0, p0, Lq2/x$b;->B:[B

    .line 54
    iget v0, p1, Lq2/x;->D:I

    iput v0, p0, Lq2/x$b;->C:I

    .line 55
    iget-object v0, p1, Lq2/x;->E:Lq2/l;

    iput-object v0, p0, Lq2/x$b;->D:Lq2/l;

    .line 56
    iget v0, p1, Lq2/x;->F:I

    iput v0, p0, Lq2/x$b;->E:I

    .line 57
    iget v0, p1, Lq2/x;->G:I

    iput v0, p0, Lq2/x$b;->F:I

    .line 58
    iget v0, p1, Lq2/x;->H:I

    iput v0, p0, Lq2/x$b;->G:I

    .line 59
    iget v0, p1, Lq2/x;->I:I

    iput v0, p0, Lq2/x$b;->H:I

    .line 60
    iget v0, p1, Lq2/x;->J:I

    iput v0, p0, Lq2/x$b;->I:I

    .line 61
    iget v0, p1, Lq2/x;->K:I

    iput v0, p0, Lq2/x$b;->J:I

    .line 62
    iget v0, p1, Lq2/x;->L:I

    iput v0, p0, Lq2/x$b;->K:I

    .line 63
    iget v0, p1, Lq2/x;->M:I

    iput v0, p0, Lq2/x$b;->L:I

    .line 64
    iget v0, p1, Lq2/x;->N:I

    iput v0, p0, Lq2/x$b;->M:I

    .line 65
    iget v0, p1, Lq2/x;->O:I

    iput v0, p0, Lq2/x$b;->N:I

    .line 66
    iget p1, p1, Lq2/x;->P:I

    iput p1, p0, Lq2/x$b;->O:I

    return-void
.end method

.method synthetic constructor <init>(Lq2/x;Lq2/x$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lq2/x$b;-><init>(Lq2/x;)V

    return-void
.end method

.method static synthetic A(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->G:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic B(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->H:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic C(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->I:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic D(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->J:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic E(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->K:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic F(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->L:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic G(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->M:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic H(Lq2/x$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/x$b;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic I(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->N:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic J(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->O:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic K(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->e:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic L(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->g:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic M(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->f:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic N(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->h:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic O(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->i:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic a(Lq2/x$b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/x$b;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(Lq2/x$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/x$b;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic c(Lq2/x$b;)Lq2/J;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/x$b;->k:Lq2/J;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic d(Lq2/x$b;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/x$b;->l:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic e(Lq2/x$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/x$b;->m:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic f(Lq2/x$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/x$b;->n:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic g(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->o:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic h(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->p:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic i(Lq2/x$b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/x$b;->q:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic j(Lq2/x$b;)Lq2/q;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/x$b;->r:Lq2/q;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic k(Lq2/x$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lq2/x$b;->s:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static synthetic l(Lq2/x$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/x$b;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic m(Lq2/x$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lq2/x$b;->t:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic n(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->u:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic o(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->v:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic p(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->w:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic q(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->x:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic r(Lq2/x$b;)F
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->y:F

    .line 2
    .line 3
    return p0
.end method

.method static synthetic s(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->z:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic t(Lq2/x$b;)F
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->A:F

    .line 2
    .line 3
    return p0
.end method

.method static synthetic u(Lq2/x$b;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/x$b;->B:[B

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic v(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->C:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic w(Lq2/x$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/x$b;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic x(Lq2/x$b;)Lq2/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lq2/x$b;->D:Lq2/l;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic y(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->E:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic z(Lq2/x$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lq2/x$b;->F:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public A0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->e:I

    .line 2
    .line 3
    return-object p0
.end method

.method public B0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->C:I

    .line 2
    .line 3
    return-object p0
.end method

.method public C0(J)Lq2/x$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lq2/x$b;->s:J

    .line 2
    .line 3
    return-object p0
.end method

.method public D0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->M:I

    .line 2
    .line 3
    return-object p0
.end method

.method public E0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->N:I

    .line 2
    .line 3
    return-object p0
.end method

.method public F0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->u:I

    .line 2
    .line 3
    return-object p0
.end method

.method public P()Lq2/x;
    .locals 2

    .line 1
    new-instance v0, Lq2/x;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lq2/x;-><init>(Lq2/x$b;Lq2/x$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public Q(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->K:I

    .line 2
    .line 3
    return-object p0
.end method

.method public R(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->g:I

    .line 2
    .line 3
    return-object p0
.end method

.method public S(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->h:I

    .line 2
    .line 3
    return-object p0
.end method

.method public T(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->F:I

    .line 2
    .line 3
    return-object p0
.end method

.method public U(Ljava/lang/String;)Lq2/x$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/x$b;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public V(Lq2/l;)Lq2/x$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/x$b;->D:Lq2/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public W(Ljava/lang/String;)Lq2/x$b;
    .locals 0

    .line 1
    invoke-static {p1}, Lq2/K;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lq2/x$b;->m:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0
.end method

.method public X(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->O:I

    .line 2
    .line 3
    return-object p0
.end method

.method public Y(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->L:I

    .line 2
    .line 3
    return-object p0
.end method

.method public Z(Ljava/lang/Object;)Lq2/x$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/x$b;->l:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public a0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->x:I

    .line 2
    .line 3
    return-object p0
.end method

.method public b0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->w:I

    .line 2
    .line 3
    return-object p0
.end method

.method public c0(Lq2/q;)Lq2/x$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/x$b;->r:Lq2/q;

    .line 2
    .line 3
    return-object p0
.end method

.method public d0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->I:I

    .line 2
    .line 3
    return-object p0
.end method

.method public e0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->J:I

    .line 2
    .line 3
    return-object p0
.end method

.method public f0(F)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->y:F

    .line 2
    .line 3
    return-object p0
.end method

.method public g0(Z)Lq2/x$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq2/x$b;->t:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public h0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->v:I

    .line 2
    .line 3
    return-object p0
.end method

.method public i0(I)Lq2/x$b;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lq2/x$b;->a:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0
.end method

.method public j0(Ljava/lang/String;)Lq2/x$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/x$b;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public k0(Ljava/util/List;)Lq2/x$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/x$b;->q:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public l0(Ljava/lang/String;)Lq2/x$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/x$b;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public m0(Ljava/util/List;)Lq2/x$b;
    .locals 0

    .line 1
    invoke-static {p1}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lq2/x$b;->c:Ljava/util/List;

    .line 6
    .line 7
    return-object p0
.end method

.method public n0(Ljava/lang/String;)Lq2/x$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/x$b;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public o0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->o:I

    .line 2
    .line 3
    return-object p0
.end method

.method public p0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->p:I

    .line 2
    .line 3
    return-object p0
.end method

.method public q0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->E:I

    .line 2
    .line 3
    return-object p0
.end method

.method public r0(Lq2/J;)Lq2/x$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/x$b;->k:Lq2/J;

    .line 2
    .line 3
    return-object p0
.end method

.method public s0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->H:I

    .line 2
    .line 3
    return-object p0
.end method

.method public t0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->i:I

    .line 2
    .line 3
    return-object p0
.end method

.method public u0(F)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->A:F

    .line 2
    .line 3
    return-object p0
.end method

.method public v0([B)Lq2/x$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/x$b;->B:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public w0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->f:I

    .line 2
    .line 3
    return-object p0
.end method

.method public x0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->z:I

    .line 2
    .line 3
    return-object p0
.end method

.method public y0(Ljava/lang/String;)Lq2/x$b;
    .locals 0

    .line 1
    invoke-static {p1}, Lq2/K;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lq2/x$b;->n:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0
.end method

.method public z0(I)Lq2/x$b;
    .locals 0

    .line 1
    iput p1, p0, Lq2/x$b;->G:I

    .line 2
    .line 3
    return-object p0
.end method
