.class public final enum LY/S0;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum a:LY/S0;

.field public static final enum b:LY/S0;

.field public static final enum c:LY/S0;

.field public static final enum d:LY/S0;

.field public static final enum e:LY/S0;

.field public static final enum f:LY/S0;

.field public static final enum g:LY/S0;

.field private static final synthetic h:[LY/S0;

.field private static final synthetic i:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LY/S0;

    .line 2
    .line 3
    const-string v1, "Invalid"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LY/S0;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LY/S0;->a:LY/S0;

    .line 10
    .line 11
    new-instance v0, LY/S0;

    .line 12
    .line 13
    const-string v1, "Cancelled"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LY/S0;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LY/S0;->b:LY/S0;

    .line 20
    .line 21
    new-instance v0, LY/S0;

    .line 22
    .line 23
    const-string v1, "InitialPending"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, LY/S0;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LY/S0;->c:LY/S0;

    .line 30
    .line 31
    new-instance v0, LY/S0;

    .line 32
    .line 33
    const-string v1, "RecomposePending"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, LY/S0;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LY/S0;->d:LY/S0;

    .line 40
    .line 41
    new-instance v0, LY/S0;

    .line 42
    .line 43
    const-string v1, "Recomposing"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, LY/S0;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, LY/S0;->e:LY/S0;

    .line 50
    .line 51
    new-instance v0, LY/S0;

    .line 52
    .line 53
    const-string v1, "ApplyPending"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2}, LY/S0;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, LY/S0;->f:LY/S0;

    .line 60
    .line 61
    new-instance v0, LY/S0;

    .line 62
    .line 63
    const-string v1, "Applied"

    .line 64
    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-direct {v0, v1, v2}, LY/S0;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v0, LY/S0;->g:LY/S0;

    .line 70
    .line 71
    invoke-static {}, LY/S0;->a()[LY/S0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, LY/S0;->h:[LY/S0;

    .line 76
    .line 77
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sput-object v0, LY/S0;->i:Lkotlin/enums/EnumEntries;

    .line 82
    .line 83
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final synthetic a()[LY/S0;
    .locals 7

    .line 1
    sget-object v0, LY/S0;->a:LY/S0;

    .line 2
    .line 3
    sget-object v1, LY/S0;->b:LY/S0;

    .line 4
    .line 5
    sget-object v2, LY/S0;->c:LY/S0;

    .line 6
    .line 7
    sget-object v3, LY/S0;->d:LY/S0;

    .line 8
    .line 9
    sget-object v4, LY/S0;->e:LY/S0;

    .line 10
    .line 11
    sget-object v5, LY/S0;->f:LY/S0;

    .line 12
    .line 13
    sget-object v6, LY/S0;->g:LY/S0;

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [LY/S0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LY/S0;
    .locals 1

    .line 1
    const-class v0, LY/S0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LY/S0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LY/S0;
    .locals 1

    .line 1
    sget-object v0, LY/S0;->h:[LY/S0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LY/S0;

    .line 8
    .line 9
    return-object v0
.end method
