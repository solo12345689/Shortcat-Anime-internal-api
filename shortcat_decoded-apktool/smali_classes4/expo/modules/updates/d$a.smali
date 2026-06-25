.class public abstract enum Lexpo/modules/updates/d$a;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/updates/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/updates/d$a$a;,
        Lexpo/modules/updates/d$a$b;,
        Lexpo/modules/updates/d$a$c;,
        Lexpo/modules/updates/d$a$d;
    }
.end annotation


# static fields
.field public static final enum a:Lexpo/modules/updates/d$a;

.field public static final enum b:Lexpo/modules/updates/d$a;

.field public static final enum c:Lexpo/modules/updates/d$a;

.field public static final enum d:Lexpo/modules/updates/d$a;

.field private static final synthetic e:[Lexpo/modules/updates/d$a;

.field private static final synthetic f:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lexpo/modules/updates/d$a$c;

    .line 2
    .line 3
    const-string v1, "NEVER"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lexpo/modules/updates/d$a$c;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lexpo/modules/updates/d$a;->a:Lexpo/modules/updates/d$a;

    .line 10
    .line 11
    new-instance v0, Lexpo/modules/updates/d$a$b;

    .line 12
    .line 13
    const-string v1, "ERROR_RECOVERY_ONLY"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lexpo/modules/updates/d$a$b;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lexpo/modules/updates/d$a;->b:Lexpo/modules/updates/d$a;

    .line 20
    .line 21
    new-instance v0, Lexpo/modules/updates/d$a$d;

    .line 22
    .line 23
    const-string v1, "WIFI_ONLY"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lexpo/modules/updates/d$a$d;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lexpo/modules/updates/d$a;->c:Lexpo/modules/updates/d$a;

    .line 30
    .line 31
    new-instance v0, Lexpo/modules/updates/d$a$a;

    .line 32
    .line 33
    const-string v1, "ALWAYS"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lexpo/modules/updates/d$a$a;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lexpo/modules/updates/d$a;->d:Lexpo/modules/updates/d$a;

    .line 40
    .line 41
    invoke-static {}, Lexpo/modules/updates/d$a;->a()[Lexpo/modules/updates/d$a;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lexpo/modules/updates/d$a;->e:[Lexpo/modules/updates/d$a;

    .line 46
    .line 47
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lexpo/modules/updates/d$a;->f:Lkotlin/enums/EnumEntries;

    .line 52
    .line 53
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lexpo/modules/updates/d$a;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic a()[Lexpo/modules/updates/d$a;
    .locals 4

    .line 1
    sget-object v0, Lexpo/modules/updates/d$a;->a:Lexpo/modules/updates/d$a;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/updates/d$a;->b:Lexpo/modules/updates/d$a;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/updates/d$a;->c:Lexpo/modules/updates/d$a;

    .line 6
    .line 7
    sget-object v3, Lexpo/modules/updates/d$a;->d:Lexpo/modules/updates/d$a;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lexpo/modules/updates/d$a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/updates/d$a;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/updates/d$a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/updates/d$a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/updates/d$a;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/updates/d$a;->e:[Lexpo/modules/updates/d$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/updates/d$a;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method
