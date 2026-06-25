.class final LU/G$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/G;->a(ZZLB/k;Landroidx/compose/ui/e;LU/f0;Ls0/E1;FFLY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LU/G;

.field final synthetic b:Z

.field final synthetic c:Z

.field final synthetic d:LB/k;

.field final synthetic e:Landroidx/compose/ui/e;

.field final synthetic f:LU/f0;

.field final synthetic g:Ls0/E1;

.field final synthetic h:F

.field final synthetic i:F

.field final synthetic j:I

.field final synthetic k:I


# direct methods
.method constructor <init>(LU/G;ZZLB/k;Landroidx/compose/ui/e;LU/f0;Ls0/E1;FFII)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/G$b;->a:LU/G;

    .line 2
    .line 3
    iput-boolean p2, p0, LU/G$b;->b:Z

    .line 4
    .line 5
    iput-boolean p3, p0, LU/G$b;->c:Z

    .line 6
    .line 7
    iput-object p4, p0, LU/G$b;->d:LB/k;

    .line 8
    .line 9
    iput-object p5, p0, LU/G$b;->e:Landroidx/compose/ui/e;

    .line 10
    .line 11
    iput-object p6, p0, LU/G$b;->f:LU/f0;

    .line 12
    .line 13
    iput-object p7, p0, LU/G$b;->g:Ls0/E1;

    .line 14
    .line 15
    iput p8, p0, LU/G$b;->h:F

    .line 16
    .line 17
    iput p9, p0, LU/G$b;->i:F

    .line 18
    .line 19
    iput p10, p0, LU/G$b;->j:I

    .line 20
    .line 21
    iput p11, p0, LU/G$b;->k:I

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 25
    .line 26
    .line 27
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

    invoke-virtual {p0, p1, p2}, LU/G$b;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 12

    .line 2
    iget-object v0, p0, LU/G$b;->a:LU/G;

    iget-boolean v1, p0, LU/G$b;->b:Z

    iget-boolean v2, p0, LU/G$b;->c:Z

    iget-object v3, p0, LU/G$b;->d:LB/k;

    iget-object v4, p0, LU/G$b;->e:Landroidx/compose/ui/e;

    iget-object v5, p0, LU/G$b;->f:LU/f0;

    iget-object v6, p0, LU/G$b;->g:Ls0/E1;

    iget v7, p0, LU/G$b;->h:F

    iget v8, p0, LU/G$b;->i:F

    iget p2, p0, LU/G$b;->j:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v10

    iget v11, p0, LU/G$b;->k:I

    move-object v9, p1

    invoke-virtual/range {v0 .. v11}, LU/G;->a(ZZLB/k;Landroidx/compose/ui/e;LU/f0;Ls0/E1;FFLY/m;II)V

    return-void
.end method
