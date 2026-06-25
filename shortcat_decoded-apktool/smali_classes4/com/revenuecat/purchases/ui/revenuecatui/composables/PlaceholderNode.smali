.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderNode;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/t;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\u0008*\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u0006\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderNode;",
        "Landroidx/compose/ui/e$c;",
        "LK0/t;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;",
        "placeholder",
        "<init>",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;)V",
        "Lu0/c;",
        "LTd/L;",
        "draw",
        "(Lu0/c;)V",
        "Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;",
        "getPlaceholder",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;",
        "setPlaceholder",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private placeholder:Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;


# direct methods
.method public constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;)V
    .locals 1

    .line 1
    const-string v0, "placeholder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderNode;->placeholder:Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public draw(Lu0/c;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderNode;->placeholder:Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;->draw$revenuecatui_defaultsBc8Release(Lu0/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final getPlaceholder()Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderNode;->placeholder:Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic onDensityChange()V
    .locals 0

    .line 1
    invoke-super {p0}, LK0/j;->onDensityChange()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic onLayoutDirectionChange()V
    .locals 0

    .line 1
    invoke-super {p0}, LK0/j;->onLayoutDirectionChange()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic onMeasureResultChanged()V
    .locals 0

    .line 1
    invoke-super {p0}, LK0/t;->onMeasureResultChanged()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setPlaceholder(Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderNode;->placeholder:Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;

    .line 7
    .line 8
    return-void
.end method
