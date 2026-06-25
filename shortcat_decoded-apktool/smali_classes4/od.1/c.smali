.class public final enum Lod/c;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lod/c$a;
    }
.end annotation


# static fields
.field public static final b:Lod/c$a;

.field public static final enum c:Lod/c;

.field private static final synthetic d:[Lod/c;

.field private static final synthetic e:Lkotlin/enums/EnumEntries;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lod/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "rsa-v1_5-sha256"

    .line 5
    .line 6
    const-string v3, "RSA_SHA256"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lod/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lod/c;->c:Lod/c;

    .line 12
    .line 13
    invoke-static {}, Lod/c;->a()[Lod/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lod/c;->d:[Lod/c;

    .line 18
    .line 19
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lod/c;->e:Lkotlin/enums/EnumEntries;

    .line 24
    .line 25
    new-instance v0, Lod/c$a;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, v1}, Lod/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lod/c;->b:Lod/c$a;

    .line 32
    .line 33
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lod/c;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic a()[Lod/c;
    .locals 1

    .line 1
    sget-object v0, Lod/c;->c:Lod/c;

    .line 2
    .line 3
    filled-new-array {v0}, [Lod/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lod/c;
    .locals 1

    .line 1
    const-class v0, Lod/c;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lod/c;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lod/c;
    .locals 1

    .line 1
    sget-object v0, Lod/c;->d:[Lod/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lod/c;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/c;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
