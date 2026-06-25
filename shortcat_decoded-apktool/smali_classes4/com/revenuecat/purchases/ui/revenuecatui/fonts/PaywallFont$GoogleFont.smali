.class public final Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;
.super Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "GoogleFont"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u001a\u0012\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u001f\u001a\u0004\u0008 \u0010\r\u00a8\u0006!"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont;",
        "",
        "fontName",
        "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;",
        "fontProvider",
        "LY0/L;",
        "fontWeight",
        "",
        "fontStyle",
        "<init>",
        "(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;LY0/L;I)V",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "LTd/L;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "Ljava/lang/String;",
        "getFontName",
        "()Ljava/lang/String;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;",
        "getFontProvider",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;",
        "LY0/L;",
        "getFontWeight",
        "()LY0/L;",
        "getFontWeight$annotations",
        "()V",
        "I",
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
            "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final fontName:Ljava/lang/String;

.field private final fontProvider:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;

.field private final fontStyle:I

.field private final fontWeight:LY0/L;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont$Creator;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont$Creator;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;LY0/L;I)V
    .locals 1

    const-string v0, "fontName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fontProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fontWeight"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontName:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontProvider:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;

    .line 7
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontWeight:LY0/L;

    .line 8
    iput p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontStyle:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;LY0/L;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 1
    sget-object p3, LY0/L;->b:LY0/L$a;

    invoke-virtual {p3}, LY0/L$a;->g()LY0/L;

    move-result-object p3

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 2
    sget-object p4, LY0/H;->b:LY0/H$a;

    invoke-virtual {p4}, LY0/H$a;->b()I

    move-result p4

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;-><init>(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;LY0/L;I)V

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
    instance-of v1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;

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
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontName:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontName:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontProvider:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontProvider:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontWeight:LY0/L;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontWeight:LY0/L;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontStyle:I

    .line 47
    .line 48
    iget p1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontStyle:I

    .line 49
    .line 50
    if-eq v1, p1, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    return v0
.end method

.method public final getFontName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFontProvider()Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontProvider:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFontStyle()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontStyle:I

    .line 2
    .line 3
    return v0
.end method

.method public final getFontWeight()LY0/L;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontWeight:LY0/L;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontProvider:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontWeight:LY0/L;

    .line 19
    .line 20
    invoke-virtual {v1}, LY0/L;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontStyle:I

    .line 28
    .line 29
    add-int/2addr v0, v1

    .line 30
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
    const-string v1, "GoogleFont(fontName="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontName:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", fontProvider="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontProvider:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", fontWeight="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontWeight:LY0/L;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", fontStyle="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontStyle:I

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const/16 v1, 0x29

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
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
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontName:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontProvider:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/GoogleFontProvider;->writeToParcel(Landroid/os/Parcel;I)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontWeightParceler;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontWeightParceler;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontWeight:LY0/L;

    .line 19
    .line 20
    invoke-virtual {v0, v1, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontWeightParceler;->write(LY0/L;Landroid/os/Parcel;I)V

    .line 21
    .line 22
    .line 23
    iget p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFont$GoogleFont;->fontStyle:I

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
