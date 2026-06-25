.class final LQ/C$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/C;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lkotlin/jvm/functions/Function2;

.field final synthetic c:I

.field final synthetic d:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ/C$b;->a:Landroidx/compose/ui/e;

    .line 2
    .line 3
    iput-object p2, p0, LQ/C$b;->b:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    iput p3, p0, LQ/C$b;->c:I

    .line 6
    .line 7
    iput p4, p0, LQ/C$b;->d:I

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
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

    invoke-virtual {p0, p1, p2}, LQ/C$b;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 3

    .line 2
    iget-object p2, p0, LQ/C$b;->a:Landroidx/compose/ui/e;

    iget-object v0, p0, LQ/C$b;->b:Lkotlin/jvm/functions/Function2;

    iget v1, p0, LQ/C$b;->c:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LY/g1;->a(I)I

    move-result v1

    iget v2, p0, LQ/C$b;->d:I

    invoke-static {p2, v0, p1, v1, v2}, LQ/C;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/m;II)V

    return-void
.end method
