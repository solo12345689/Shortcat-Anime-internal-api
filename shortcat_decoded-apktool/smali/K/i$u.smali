.class final LK/i$u;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/i;->e(LQ/F;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/F;

.field final synthetic b:I


# direct methods
.method constructor <init>(LQ/F;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$u;->a:LQ/F;

    .line 2
    .line 3
    iput p2, p0, LK/i$u;->b:I

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
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

    invoke-virtual {p0, p1, p2}, LK/i$u;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 1

    .line 2
    iget-object p2, p0, LK/i$u;->a:LQ/F;

    iget v0, p0, LK/i$u;->b:I

    or-int/lit8 v0, v0, 0x1

    invoke-static {v0}, LY/g1;->a(I)I

    move-result v0

    invoke-static {p2, p1, v0}, LK/i;->e(LQ/F;LY/m;I)V

    return-void
.end method
