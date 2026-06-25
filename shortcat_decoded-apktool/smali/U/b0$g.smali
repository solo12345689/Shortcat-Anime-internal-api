.class final LU/b0$g;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/b0;->d(LU/W;Landroidx/compose/ui/e;ZLs0/E1;JJJJJLY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LU/W;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Z

.field final synthetic d:Ls0/E1;

.field final synthetic e:J

.field final synthetic f:J

.field final synthetic g:J

.field final synthetic h:J

.field final synthetic i:J

.field final synthetic j:I

.field final synthetic k:I


# direct methods
.method constructor <init>(LU/W;Landroidx/compose/ui/e;ZLs0/E1;JJJJJII)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/b0$g;->a:LU/W;

    .line 2
    .line 3
    iput-object p2, p0, LU/b0$g;->b:Landroidx/compose/ui/e;

    .line 4
    .line 5
    iput-boolean p3, p0, LU/b0$g;->c:Z

    .line 6
    .line 7
    iput-object p4, p0, LU/b0$g;->d:Ls0/E1;

    .line 8
    .line 9
    iput-wide p5, p0, LU/b0$g;->e:J

    .line 10
    .line 11
    iput-wide p7, p0, LU/b0$g;->f:J

    .line 12
    .line 13
    iput-wide p9, p0, LU/b0$g;->g:J

    .line 14
    .line 15
    iput-wide p11, p0, LU/b0$g;->h:J

    .line 16
    .line 17
    iput-wide p13, p0, LU/b0$g;->i:J

    .line 18
    .line 19
    iput p15, p0, LU/b0$g;->j:I

    .line 20
    .line 21
    move/from16 p1, p16

    .line 22
    .line 23
    iput p1, p0, LU/b0$g;->k:I

    .line 24
    .line 25
    const/4 p1, 0x2

    .line 26
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 27
    .line 28
    .line 29
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

    invoke-virtual {p0, p1, p2}, LU/b0$g;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 18

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, LU/b0$g;->a:LU/W;

    iget-object v2, v0, LU/b0$g;->b:Landroidx/compose/ui/e;

    iget-boolean v3, v0, LU/b0$g;->c:Z

    iget-object v4, v0, LU/b0$g;->d:Ls0/E1;

    iget-wide v5, v0, LU/b0$g;->e:J

    iget-wide v7, v0, LU/b0$g;->f:J

    iget-wide v9, v0, LU/b0$g;->g:J

    iget-wide v11, v0, LU/b0$g;->h:J

    iget-wide v13, v0, LU/b0$g;->i:J

    iget v15, v0, LU/b0$g;->j:I

    or-int/lit8 v15, v15, 0x1

    invoke-static {v15}, LY/g1;->a(I)I

    move-result v16

    iget v15, v0, LU/b0$g;->k:I

    move/from16 v17, v15

    move-object/from16 v15, p1

    invoke-static/range {v1 .. v17}, LU/b0;->d(LU/W;Landroidx/compose/ui/e;ZLs0/E1;JJJJJLY/m;II)V

    return-void
.end method
