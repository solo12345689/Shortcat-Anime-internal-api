.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDOrderedList$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt;->MDOrderedList-lzeOXFE(LYh/u;JLU0/Y0;JLY0/L;LY0/u;Lg1/j;ZZLY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lie/o;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LYh/s;",
        "it",
        "LTd/L;",
        "invoke",
        "(LYh/s;LY/m;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $allowLinks:Z

.field final synthetic $color:J

.field final synthetic $delimiter:C

.field final synthetic $fontWeight:LY0/L;

.field final synthetic $number:Lkotlin/jvm/internal/L;

.field final synthetic $resolvedTextStyle:LU0/Y0;

.field final synthetic $textFillMaxWidth:Z


# direct methods
.method constructor <init>(LU0/Y0;ZLkotlin/jvm/internal/L;CJZLY0/L;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDOrderedList$1;->$resolvedTextStyle:LU0/Y0;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDOrderedList$1;->$textFillMaxWidth:Z

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDOrderedList$1;->$number:Lkotlin/jvm/internal/L;

    .line 6
    .line 7
    iput-char p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDOrderedList$1;->$delimiter:C

    .line 8
    .line 9
    iput-wide p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDOrderedList$1;->$color:J

    .line 10
    .line 11
    iput-boolean p7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDOrderedList$1;->$allowLinks:Z

    .line 12
    .line 13
    iput-object p8, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDOrderedList$1;->$fontWeight:LY0/L;

    .line 14
    .line 15
    const/4 p1, 0x3

    .line 16
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LYh/s;

    check-cast p2, LY/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDOrderedList$1;->invoke(LYh/s;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LYh/s;LY/m;I)V
    .locals 10

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDOrderedList.<anonymous> (Markdown.kt:330)"

    const v2, -0x5ff00fa8

    .line 2
    invoke-static {v2, p3, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    :cond_0
    iget-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDOrderedList$1;->$resolvedTextStyle:LU0/Y0;

    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDOrderedList$1;->$number:Lkotlin/jvm/internal/L;

    iget-char v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDOrderedList$1;->$delimiter:C

    iget-wide v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDOrderedList$1;->$color:J

    iget-boolean v6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDOrderedList$1;->$allowLinks:Z

    iget-object v7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDOrderedList$1;->$fontWeight:LY0/L;

    .line 3
    new-instance v2, LU0/e$b;

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-direct {v2, v3, v9, v8}, LU0/e$b;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    invoke-virtual {p3}, LU0/Y0;->O()LU0/I0;

    move-result-object p3

    invoke-virtual {v2, p3}, LU0/e$b;->k(LU0/I0;)I

    .line 5
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, v0, Lkotlin/jvm/internal/L;->a:I

    add-int/lit8 v8, v3, 0x1

    iput v8, v0, Lkotlin/jvm/internal/L;->a:I

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, LU0/e$b;->g(Ljava/lang/String;)V

    move-object v3, p1

    .line 6
    invoke-static/range {v2 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt;->access$appendMarkdownChildren-XO-JAsU(LU0/e$b;LYh/s;JZLY0/L;)V

    .line 7
    invoke-virtual {v2}, LU0/e$b;->h()V

    .line 8
    invoke-virtual {v2}, LU0/e$b;->l()LU0/e;

    move-result-object v3

    .line 9
    iget-object v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDOrderedList$1;->$resolvedTextStyle:LU0/Y0;

    .line 10
    iget-boolean v5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDOrderedList$1;->$textFillMaxWidth:Z

    const/4 v8, 0x0

    const/16 v9, 0x8

    const/4 v6, 0x0

    move-object v7, p2

    .line 11
    invoke-static/range {v3 .. v9}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt;->access$MarkdownText(LU0/e;LU0/Y0;ZLandroidx/compose/ui/e;LY/m;II)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LY/w;->T()V

    :cond_1
    return-void
.end method
