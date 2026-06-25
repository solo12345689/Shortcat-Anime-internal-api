.class public final Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;
.super Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ResourceFont"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\t\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0011\u001a\u0004\u0008\u0012\u0010\nR\u001d\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0013\u0012\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0011\u001a\u0004\u0008\u0018\u0010\n\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont;",
        "",
        "resourceId",
        "LY0/L;",
        "fontWeight",
        "fontStyle",
        "<init>",
        "(ILY0/L;I)V",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "LTd/L;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "I",
        "getResourceId",
        "LY0/L;",
        "getFontWeight",
        "()LY0/L;",
        "getFontWeight$annotations",
        "()V",
        "getFontStyle",
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


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final fontStyle:I

.field private final fontWeight:LY0/L;

.field private final resourceId:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont$Creator;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont$Creator;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(ILY0/L;I)V
    .locals 1

    const-string v0, "fontWeight"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    iput p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->resourceId:I

    .line 6
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->fontWeight:LY0/L;

    .line 7
    iput p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->fontStyle:I

    return-void
.end method

.method public synthetic constructor <init>(ILY0/L;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 1
    sget-object p2, LY0/L;->b:LY0/L$a;

    invoke-virtual {p2}, LY0/L$a;->g()LY0/L;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 2
    sget-object p3, LY0/H;->b:LY0/H$a;

    invoke-virtual {p3}, LY0/H$a;->b()I

    move-result p3

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;-><init>(ILY0/L;I)V

    return-void
.end method

.method public static synthetic getFontWeight$annotations()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;

    .line 12
    .line 13
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->resourceId:I

    .line 14
    .line 15
    iget v3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->resourceId:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->fontWeight:LY0/L;

    .line 21
    .line 22
    iget-object v3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->fontWeight:LY0/L;

    .line 23
    .line 24
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->fontStyle:I

    .line 32
    .line 33
    iget p1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->fontStyle:I

    .line 34
    .line 35
    if-eq v1, p1, :cond_4

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    return v0
.end method

.method public final getFontStyle()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->fontStyle:I

    .line 2
    .line 3
    return v0
.end method

.method public final getFontWeight()LY0/L;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->fontWeight:LY0/L;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getResourceId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->resourceId:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->resourceId:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->fontWeight:LY0/L;

    .line 6
    .line 7
    invoke-virtual {v1}, LY0/L;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v0, v1

    .line 12
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->fontStyle:I

    .line 15
    .line 16
    add-int/2addr v0, v1

    .line 17
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "ResourceFont(resourceId="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->resourceId:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", fontWeight="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->fontWeight:LY0/L;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", fontStyle="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->fontStyle:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 v1, 0x29

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    const-string v0, "out"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->resourceId:I

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontWeightParceler;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontWeightParceler;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->fontWeight:LY0/L;

    .line 14
    .line 15
    invoke-virtual {v0, v1, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontWeightParceler;->write(LY0/L;Landroid/os/Parcel;I)V

    .line 16
    .line 17
    .line 18
    iget p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$ResourceFont;->fontStyle:I

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
