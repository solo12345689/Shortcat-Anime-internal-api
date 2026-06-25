.class public final enum LBb/p;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum b:LBb/p;

.field public static final enum c:LBb/p;

.field public static final enum d:LBb/p;

.field public static final enum e:LBb/p;

.field public static final enum f:LBb/p;

.field public static final enum g:LBb/p;

.field public static final enum h:LBb/p;

.field private static final synthetic i:[LBb/p;

.field private static final synthetic j:Lkotlin/enums/EnumEntries;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LBb/p;

    .line 2
    .line 3
    const-string v1, "INITIALIZED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, LBb/p;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LBb/p;->b:LBb/p;

    .line 10
    .line 11
    new-instance v0, LBb/p;

    .line 12
    .line 13
    const-string v1, "STARTED"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, LBb/p;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LBb/p;->c:LBb/p;

    .line 20
    .line 21
    new-instance v0, LBb/p;

    .line 22
    .line 23
    const-string v1, "RESPONSE_RECEIVED"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, LBb/p;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LBb/p;->d:LBb/p;

    .line 30
    .line 31
    new-instance v0, LBb/p;

    .line 32
    .line 33
    const-string v1, "BODY_COMPLETED"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2, v2}, LBb/p;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LBb/p;->e:LBb/p;

    .line 40
    .line 41
    new-instance v0, LBb/p;

    .line 42
    .line 43
    const-string v1, "BODY_STREAMING_STARTED"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2, v2}, LBb/p;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v0, LBb/p;->f:LBb/p;

    .line 50
    .line 51
    new-instance v0, LBb/p;

    .line 52
    .line 53
    const-string v1, "BODY_STREAMING_CANCELED"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2, v2}, LBb/p;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    sput-object v0, LBb/p;->g:LBb/p;

    .line 60
    .line 61
    new-instance v0, LBb/p;

    .line 62
    .line 63
    const-string v1, "ERROR_RECEIVED"

    .line 64
    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-direct {v0, v1, v2, v2}, LBb/p;-><init>(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    sput-object v0, LBb/p;->h:LBb/p;

    .line 70
    .line 71
    invoke-static {}, LBb/p;->a()[LBb/p;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, LBb/p;->i:[LBb/p;

    .line 76
    .line 77
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sput-object v0, LBb/p;->j:Lkotlin/enums/EnumEntries;

    .line 82
    .line 83
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LBb/p;->a:I

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic a()[LBb/p;
    .locals 7

    .line 1
    sget-object v0, LBb/p;->b:LBb/p;

    .line 2
    .line 3
    sget-object v1, LBb/p;->c:LBb/p;

    .line 4
    .line 5
    sget-object v2, LBb/p;->d:LBb/p;

    .line 6
    .line 7
    sget-object v3, LBb/p;->e:LBb/p;

    .line 8
    .line 9
    sget-object v4, LBb/p;->f:LBb/p;

    .line 10
    .line 11
    sget-object v5, LBb/p;->g:LBb/p;

    .line 12
    .line 13
    sget-object v6, LBb/p;->h:LBb/p;

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [LBb/p;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LBb/p;
    .locals 1

    .line 1
    const-class v0, LBb/p;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LBb/p;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LBb/p;
    .locals 1

    .line 1
    sget-object v0, LBb/p;->i:[LBb/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LBb/p;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, LBb/p;->a:I

    .line 2
    .line 3
    return v0
.end method
