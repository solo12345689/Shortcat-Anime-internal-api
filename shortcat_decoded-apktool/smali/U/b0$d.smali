.class final LU/b0$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/b0;->c(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLs0/E1;JJJJLkotlin/jvm/functions/Function2;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lkotlin/jvm/functions/Function2;

.field final synthetic c:Lkotlin/jvm/functions/Function2;

.field final synthetic d:Lkotlin/jvm/functions/Function2;

.field final synthetic e:J

.field final synthetic f:J


# direct methods
.method constructor <init>(ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJ)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LU/b0$d;->a:Z

    .line 2
    .line 3
    iput-object p2, p0, LU/b0$d;->b:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    iput-object p3, p0, LU/b0$d;->c:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    iput-object p4, p0, LU/b0$d;->d:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    iput-wide p5, p0, LU/b0$d;->e:J

    .line 10
    .line 11
    iput-wide p7, p0, LU/b0$d;->f:J

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LU/b0$d;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 12

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2
    invoke-interface {p1}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:121)"

    const v2, -0x6d0e72d6

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, LX/n;->a:LX/n;

    invoke-virtual {p2}, LX/n;->i()LX/u;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p1, v1}, LU/p0;->c(LX/u;LY/m;I)LU0/Y0;

    move-result-object v0

    .line 5
    invoke-virtual {p2}, LX/n;->b()LX/u;

    move-result-object p2

    invoke-static {p2, p1, v1}, LU/p0;->c(LX/u;LY/m;I)LU0/Y0;

    move-result-object v7

    .line 6
    invoke-static {}, LU/j0;->d()LY/b1;

    move-result-object p2

    invoke-virtual {p2, v0}, LY/b1;->d(Ljava/lang/Object;)LY/c1;

    move-result-object p2

    new-instance v2, LU/b0$d$a;

    iget-boolean v3, p0, LU/b0$d;->a:Z

    iget-object v4, p0, LU/b0$d;->b:Lkotlin/jvm/functions/Function2;

    iget-object v5, p0, LU/b0$d;->c:Lkotlin/jvm/functions/Function2;

    iget-object v6, p0, LU/b0$d;->d:Lkotlin/jvm/functions/Function2;

    iget-wide v8, p0, LU/b0$d;->e:J

    iget-wide v10, p0, LU/b0$d;->f:J

    invoke-direct/range {v2 .. v11}, LU/b0$d$a;-><init>(ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LU0/Y0;JJ)V

    const/16 v0, 0x36

    const v1, 0x31d2b1ea

    const/4 v3, 0x1

    invoke-static {v1, v3, v2, p1, v0}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v0

    sget v1, LY/c1;->i:I

    or-int/lit8 v1, v1, 0x30

    invoke-static {p2, v0, p1, v1}, LY/H;->c(LY/c1;Lkotlin/jvm/functions/Function2;LY/m;I)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void
.end method
