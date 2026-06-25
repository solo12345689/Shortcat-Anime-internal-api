.class final LW/j$o;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW/j;->e(JLkotlin/jvm/functions/Function2;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lkotlin/jvm/functions/Function2;

.field final synthetic c:I


# direct methods
.method constructor <init>(JLkotlin/jvm/functions/Function2;I)V
    .locals 0

    .line 1
    iput-wide p1, p0, LW/j$o;->a:J

    .line 2
    .line 3
    iput-object p3, p0, LW/j$o;->b:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    iput p4, p0, LW/j$o;->c:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
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

    invoke-virtual {p0, p1, p2}, LW/j$o;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 3

    .line 2
    iget-wide v0, p0, LW/j$o;->a:J

    iget-object p2, p0, LW/j$o;->b:Lkotlin/jvm/functions/Function2;

    iget v2, p0, LW/j$o;->c:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, LY/g1;->a(I)I

    move-result v2

    invoke-static {v0, v1, p2, p1, v2}, LW/j;->g(JLkotlin/jvm/functions/Function2;LY/m;I)V

    return-void
.end method
