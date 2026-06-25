.class public abstract LY0/j;
.super LY0/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final d:LY0/L;

.field private final e:I

.field private f:Z

.field private g:Landroid/graphics/Typeface;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(LY0/L;ILY0/K$d;)V
    .locals 3

    .line 2
    sget-object v0, LY0/F;->a:LY0/F$a;

    invoke-virtual {v0}, LY0/F$a;->b()I

    move-result v0

    .line 3
    sget-object v1, LY0/k;->a:LY0/k;

    const/4 v2, 0x0

    .line 4
    invoke-direct {p0, v0, v1, p3, v2}, LY0/c;-><init>(ILY0/c$a;LY0/K$d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    iput-object p1, p0, LY0/j;->d:LY0/L;

    .line 6
    iput p2, p0, LY0/j;->e:I

    return-void
.end method

.method public synthetic constructor <init>(LY0/L;ILY0/K$d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LY0/j;-><init>(LY0/L;ILY0/K$d;)V

    return-void
.end method


# virtual methods
.method public final b()LY0/L;
    .locals 1

    .line 1
    iget-object v0, p0, LY0/j;->d:LY0/L;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, LY0/j;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public abstract f(Landroid/content/Context;)Landroid/graphics/Typeface;
.end method

.method public final g(Landroid/content/Context;)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    iget-boolean v0, p0, LY0/j;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LY0/j;->g:Landroid/graphics/Typeface;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, LY0/j;->f(Landroid/content/Context;)Landroid/graphics/Typeface;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, LY0/j;->g:Landroid/graphics/Typeface;

    .line 14
    .line 15
    :cond_0
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, LY0/j;->f:Z

    .line 17
    .line 18
    iget-object p1, p0, LY0/j;->g:Landroid/graphics/Typeface;

    .line 19
    .line 20
    return-object p1
.end method

.method public final h(Landroid/graphics/Typeface;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY0/j;->g:Landroid/graphics/Typeface;

    .line 2
    .line 3
    return-void
.end method
