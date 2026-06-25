.class final Ly/k$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly/k;->b(Ljava/lang/String;ZLy/b;Landroidx/compose/ui/e;Lie/o;Lie/a;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Z

.field final synthetic c:Ly/b;

.field final synthetic d:Landroidx/compose/ui/e;

.field final synthetic e:Lie/o;

.field final synthetic f:Lie/a;

.field final synthetic g:I

.field final synthetic h:I


# direct methods
.method constructor <init>(Ljava/lang/String;ZLy/b;Landroidx/compose/ui/e;Lie/o;Lie/a;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly/k$c;->a:Ljava/lang/String;

    .line 2
    .line 3
    iput-boolean p2, p0, Ly/k$c;->b:Z

    .line 4
    .line 5
    iput-object p3, p0, Ly/k$c;->c:Ly/b;

    .line 6
    .line 7
    iput-object p4, p0, Ly/k$c;->d:Landroidx/compose/ui/e;

    .line 8
    .line 9
    iput-object p5, p0, Ly/k$c;->e:Lie/o;

    .line 10
    .line 11
    iput-object p6, p0, Ly/k$c;->f:Lie/a;

    .line 12
    .line 13
    iput p7, p0, Ly/k$c;->g:I

    .line 14
    .line 15
    iput p8, p0, Ly/k$c;->h:I

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

    invoke-virtual {p0, p1, p2}, Ly/k$c;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 9

    .line 2
    iget-object v0, p0, Ly/k$c;->a:Ljava/lang/String;

    iget-boolean v1, p0, Ly/k$c;->b:Z

    iget-object v2, p0, Ly/k$c;->c:Ly/b;

    iget-object v3, p0, Ly/k$c;->d:Landroidx/compose/ui/e;

    iget-object v4, p0, Ly/k$c;->e:Lie/o;

    iget-object v5, p0, Ly/k$c;->f:Lie/a;

    iget p2, p0, Ly/k$c;->g:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v7

    iget v8, p0, Ly/k$c;->h:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, Ly/k;->b(Ljava/lang/String;ZLy/b;Landroidx/compose/ui/e;Lie/o;Lie/a;LY/m;II)V

    return-void
.end method
