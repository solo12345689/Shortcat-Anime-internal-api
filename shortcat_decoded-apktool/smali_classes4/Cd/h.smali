.class public final enum LCd/h;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum b:LCd/h;

.field public static final enum c:LCd/h;

.field public static final enum d:LCd/h;

.field public static final enum e:LCd/h;

.field private static final synthetic f:[LCd/h;

.field private static final synthetic g:Lkotlin/enums/EnumEntries;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LCd/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "idle"

    .line 5
    .line 6
    const-string v3, "Idle"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, LCd/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LCd/h;->b:LCd/h;

    .line 12
    .line 13
    new-instance v0, LCd/h;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "checking"

    .line 17
    .line 18
    const-string v3, "Checking"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, LCd/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LCd/h;->c:LCd/h;

    .line 24
    .line 25
    new-instance v0, LCd/h;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "downloading"

    .line 29
    .line 30
    const-string v3, "Downloading"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, LCd/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, LCd/h;->d:LCd/h;

    .line 36
    .line 37
    new-instance v0, LCd/h;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "restarting"

    .line 41
    .line 42
    const-string v3, "Restarting"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, LCd/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, LCd/h;->e:LCd/h;

    .line 48
    .line 49
    invoke-static {}, LCd/h;->a()[LCd/h;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, LCd/h;->f:[LCd/h;

    .line 54
    .line 55
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, LCd/h;->g:Lkotlin/enums/EnumEntries;

    .line 60
    .line 61
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LCd/h;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic a()[LCd/h;
    .locals 4

    .line 1
    sget-object v0, LCd/h;->b:LCd/h;

    .line 2
    .line 3
    sget-object v1, LCd/h;->c:LCd/h;

    .line 4
    .line 5
    sget-object v2, LCd/h;->d:LCd/h;

    .line 6
    .line 7
    sget-object v3, LCd/h;->e:LCd/h;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [LCd/h;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public static b()Lkotlin/enums/EnumEntries;
    .locals 1

    .line 1
    sget-object v0, LCd/h;->g:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LCd/h;
    .locals 1

    .line 1
    const-class v0, LCd/h;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LCd/h;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LCd/h;
    .locals 1

    .line 1
    sget-object v0, LCd/h;->f:[LCd/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LCd/h;

    .line 8
    .line 9
    return-object v0
.end method
