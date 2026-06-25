.class final enum Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/react/ui/FontAssetManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "FontStyleExtension"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0082\u0081\u0002\u0018\u0000 \u00132\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B!\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;",
        "",
        "",
        "extension",
        "LY0/L;",
        "weight",
        "LY0/H;",
        "style",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;LY0/L;I)V",
        "Ljava/lang/String;",
        "getExtension",
        "()Ljava/lang/String;",
        "LY0/L;",
        "getWeight",
        "()LY0/L;",
        "I",
        "getStyle-_-LCdwA",
        "()I",
        "Companion",
        "REGULAR",
        "BOLD",
        "ITALIC",
        "BOLD_ITALIC",
        "react-native-purchases-ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

.field public static final enum BOLD:Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

.field public static final enum BOLD_ITALIC:Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

.field public static final Companion:Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension$Companion;

.field public static final enum ITALIC:Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

.field public static final enum REGULAR:Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;


# instance fields
.field private final extension:Ljava/lang/String;

.field private final style:I

.field private final weight:LY0/L;


# direct methods
.method private static final synthetic $values()[Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;
    .locals 4

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->REGULAR:Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 2
    .line 3
    sget-object v1, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->BOLD:Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 4
    .line 5
    sget-object v2, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->ITALIC:Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 6
    .line 7
    sget-object v3, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->BOLD_ITALIC:Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 2
    .line 3
    sget-object v6, LY0/L;->b:LY0/L$a;

    .line 4
    .line 5
    invoke-virtual {v6}, LY0/L$a;->g()LY0/L;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    sget-object v7, LY0/H;->b:LY0/H$a;

    .line 10
    .line 11
    invoke-virtual {v7}, LY0/H$a;->b()I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    const-string v1, "REGULAR"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const-string v3, ""

    .line 19
    .line 20
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;-><init>(Ljava/lang/String;ILjava/lang/String;LY0/L;I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->REGULAR:Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 24
    .line 25
    new-instance v8, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 26
    .line 27
    invoke-virtual {v6}, LY0/L$a;->b()LY0/L;

    .line 28
    .line 29
    .line 30
    move-result-object v12

    .line 31
    invoke-virtual {v7}, LY0/H$a;->b()I

    .line 32
    .line 33
    .line 34
    move-result v13

    .line 35
    const-string v9, "BOLD"

    .line 36
    .line 37
    const/4 v10, 0x1

    .line 38
    const-string v11, "_bold"

    .line 39
    .line 40
    invoke-direct/range {v8 .. v13}, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;-><init>(Ljava/lang/String;ILjava/lang/String;LY0/L;I)V

    .line 41
    .line 42
    .line 43
    sput-object v8, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->BOLD:Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 44
    .line 45
    new-instance v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 46
    .line 47
    invoke-virtual {v6}, LY0/L$a;->g()LY0/L;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v7}, LY0/H$a;->a()I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    const-string v1, "ITALIC"

    .line 56
    .line 57
    const/4 v2, 0x2

    .line 58
    const-string v3, "_italic"

    .line 59
    .line 60
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;-><init>(Ljava/lang/String;ILjava/lang/String;LY0/L;I)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->ITALIC:Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 64
    .line 65
    new-instance v8, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 66
    .line 67
    invoke-virtual {v6}, LY0/L$a;->b()LY0/L;

    .line 68
    .line 69
    .line 70
    move-result-object v12

    .line 71
    invoke-virtual {v7}, LY0/H$a;->a()I

    .line 72
    .line 73
    .line 74
    move-result v13

    .line 75
    const-string v9, "BOLD_ITALIC"

    .line 76
    .line 77
    const/4 v10, 0x3

    .line 78
    const-string v11, "_bold_italic"

    .line 79
    .line 80
    invoke-direct/range {v8 .. v13}, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;-><init>(Ljava/lang/String;ILjava/lang/String;LY0/L;I)V

    .line 81
    .line 82
    .line 83
    sput-object v8, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->BOLD_ITALIC:Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 84
    .line 85
    invoke-static {}, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->$values()[Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->$VALUES:[Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 90
    .line 91
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 96
    .line 97
    new-instance v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension$Companion;

    .line 98
    .line 99
    const/4 v1, 0x0

    .line 100
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 101
    .line 102
    .line 103
    sput-object v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->Companion:Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension$Companion;

    .line 104
    .line 105
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;LY0/L;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LY0/L;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->extension:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->weight:LY0/L;

    .line 7
    .line 8
    iput p5, p0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->style:I

    .line 9
    .line 10
    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;
    .locals 1

    .line 1
    const-class v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->$VALUES:[Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getExtension()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->extension:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStyle-_-LCdwA()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->style:I

    .line 2
    .line 3
    return v0
.end method

.method public final getWeight()LY0/L;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;->weight:LY0/L;

    .line 2
    .line 3
    return-object v0
.end method
