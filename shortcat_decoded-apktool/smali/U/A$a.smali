.class final LU/A$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/A;->a(Lie/a;Landroidx/compose/ui/e;ZLU/y;LB/m;Lkotlin/jvm/functions/Function2;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lie/a;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Z

.field final synthetic d:LU/y;

.field final synthetic e:LB/m;

.field final synthetic f:Lkotlin/jvm/functions/Function2;

.field final synthetic g:I

.field final synthetic h:I


# direct methods
.method constructor <init>(Lie/a;Landroidx/compose/ui/e;ZLU/y;LB/m;Lkotlin/jvm/functions/Function2;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/A$a;->a:Lie/a;

    .line 2
    .line 3
    iput-object p2, p0, LU/A$a;->b:Landroidx/compose/ui/e;

    .line 4
    .line 5
    iput-boolean p3, p0, LU/A$a;->c:Z

    .line 6
    .line 7
    iput-object p4, p0, LU/A$a;->d:LU/y;

    .line 8
    .line 9
    iput-object p5, p0, LU/A$a;->e:LB/m;

    .line 10
    .line 11
    iput-object p6, p0, LU/A$a;->f:Lkotlin/jvm/functions/Function2;

    .line 12
    .line 13
    iput p7, p0, LU/A$a;->g:I

    .line 14
    .line 15
    iput p8, p0, LU/A$a;->h:I

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 19
    .line 20
    .line 21
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

    invoke-virtual {p0, p1, p2}, LU/A$a;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 9

    .line 2
    iget-object v0, p0, LU/A$a;->a:Lie/a;

    iget-object v1, p0, LU/A$a;->b:Landroidx/compose/ui/e;

    iget-boolean v2, p0, LU/A$a;->c:Z

    iget-object v3, p0, LU/A$a;->d:LU/y;

    iget-object v4, p0, LU/A$a;->e:LB/m;

    iget-object v5, p0, LU/A$a;->f:Lkotlin/jvm/functions/Function2;

    iget p2, p0, LU/A$a;->g:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v7

    iget v8, p0, LU/A$a;->h:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, LU/A;->a(Lie/a;Landroidx/compose/ui/e;ZLU/y;LB/m;Lkotlin/jvm/functions/Function2;LY/m;II)V

    return-void
.end method
