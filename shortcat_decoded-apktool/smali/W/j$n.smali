.class final LW/j$n;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW/j;->d(JLU0/Y0;Lkotlin/jvm/functions/Function2;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:LU0/Y0;

.field final synthetic c:Lkotlin/jvm/functions/Function2;

.field final synthetic d:I


# direct methods
.method constructor <init>(JLU0/Y0;Lkotlin/jvm/functions/Function2;I)V
    .locals 0

    .line 1
    iput-wide p1, p0, LW/j$n;->a:J

    .line 2
    .line 3
    iput-object p3, p0, LW/j$n;->b:LU0/Y0;

    .line 4
    .line 5
    iput-object p4, p0, LW/j$n;->c:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    iput p5, p0, LW/j$n;->d:I

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

    invoke-virtual {p0, p1, p2}, LW/j$n;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 6

    .line 2
    iget-wide v0, p0, LW/j$n;->a:J

    iget-object v2, p0, LW/j$n;->b:LU0/Y0;

    iget-object v3, p0, LW/j$n;->c:Lkotlin/jvm/functions/Function2;

    iget p2, p0, LW/j$n;->d:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v5

    move-object v4, p1

    invoke-static/range {v0 .. v5}, LW/j;->f(JLU0/Y0;Lkotlin/jvm/functions/Function2;LY/m;I)V

    return-void
.end method
