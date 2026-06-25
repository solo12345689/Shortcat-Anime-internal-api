.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt;->MDDocument-d8Fo1UA(LYh/f;JLU0/Y0;JLY0/L;LY0/u;Lg1/j;ZZZLY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $allowLinks:Z

.field final synthetic $applyFontSizeToParagraph:Z

.field final synthetic $color:J

.field final synthetic $document:LYh/f;

.field final synthetic $fontFamily:LY0/u;

.field final synthetic $fontSize:J

.field final synthetic $fontWeight:LY0/L;

.field final synthetic $style:LU0/Y0;

.field final synthetic $textAlign:Lg1/j;

.field final synthetic $textFillMaxWidth:Z


# direct methods
.method constructor <init>(LYh/f;JLU0/Y0;JLY0/L;LY0/u;Lg1/j;ZZZI)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$document:LYh/f;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$color:J

    .line 4
    .line 5
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$style:LU0/Y0;

    .line 6
    .line 7
    iput-wide p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$fontSize:J

    .line 8
    .line 9
    iput-object p7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$fontWeight:LY0/L;

    .line 10
    .line 11
    iput-object p8, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$fontFamily:LY0/u;

    .line 12
    .line 13
    iput-object p9, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$textAlign:Lg1/j;

    .line 14
    .line 15
    iput-boolean p10, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$allowLinks:Z

    .line 16
    .line 17
    iput-boolean p11, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$textFillMaxWidth:Z

    .line 18
    .line 19
    iput-boolean p12, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$applyFontSizeToParagraph:Z

    .line 20
    .line 21
    iput p13, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$$changed:I

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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 14

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$document:LYh/f;

    iget-wide v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$color:J

    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$style:LU0/Y0;

    iget-wide v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$fontSize:J

    iget-object v6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$fontWeight:LY0/L;

    iget-object v7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$fontFamily:LY0/u;

    iget-object v8, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$textAlign:Lg1/j;

    iget-boolean v9, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$allowLinks:Z

    iget-boolean v10, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$textFillMaxWidth:Z

    iget-boolean v11, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$applyFontSizeToParagraph:Z

    iget v12, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt$MDDocument$1;->$$changed:I

    or-int/lit8 v12, v12, 0x1

    invoke-static {v12}, LY/g1;->a(I)I

    move-result v13

    move-object v12, p1

    invoke-static/range {v0 .. v13}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/MarkdownKt;->access$MDDocument-d8Fo1UA(LYh/f;JLU0/Y0;JLY0/L;LY0/u;Lg1/j;ZZZLY/m;I)V

    return-void
.end method
