.class final Lm3/e$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lm3/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lm3/e;


# direct methods
.method private constructor <init>(Lm3/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm3/e$b;->a:Lm3/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lm3/e;Lm3/e$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lm3/e$b;-><init>(Lm3/e;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm3/e$b;->a:Lm3/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm3/e;->r(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(ID)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm3/e$b;->a:Lm3/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lm3/e;->u(ID)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(IILU2/q;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm3/e$b;->a:Lm3/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lm3/e;->o(IILU2/q;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm3/e$b;->a:Lm3/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lm3/e;->A(IJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lm3/e$b;->a:Lm3/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm3/e;->x(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public f(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm3/e$b;->a:Lm3/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm3/e;->C(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public g(ILjava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm3/e$b;->a:Lm3/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lm3/e;->J(ILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public h(IJJ)V
    .locals 6

    .line 1
    iget-object v0, p0, Lm3/e$b;->a:Lm3/e;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move-wide v2, p2

    .line 5
    move-wide v4, p4

    .line 6
    invoke-virtual/range {v0 .. v5}, Lm3/e;->I(IJJ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
