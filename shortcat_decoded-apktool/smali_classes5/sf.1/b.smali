.class public final enum Lsf/b;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final enum b:Lsf/b;

.field public static final enum c:Lsf/b;

.field public static final enum d:Lsf/b;

.field public static final enum e:Lsf/b;

.field public static final enum f:Lsf/b;

.field public static final enum g:Lsf/b;

.field public static final enum h:Lsf/b;

.field private static final synthetic i:[Lsf/b;

.field private static final synthetic j:Lkotlin/enums/EnumEntries;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lsf/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "<Error class: %s>"

    .line 5
    .line 6
    const-string v3, "ERROR_CLASS"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lsf/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lsf/b;->b:Lsf/b;

    .line 12
    .line 13
    new-instance v0, Lsf/b;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "<Error function>"

    .line 17
    .line 18
    const-string v3, "ERROR_FUNCTION"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lsf/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lsf/b;->c:Lsf/b;

    .line 24
    .line 25
    new-instance v0, Lsf/b;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "<Error scope>"

    .line 29
    .line 30
    const-string v3, "ERROR_SCOPE"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lsf/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lsf/b;->d:Lsf/b;

    .line 36
    .line 37
    new-instance v0, Lsf/b;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "<Error module>"

    .line 41
    .line 42
    const-string v3, "ERROR_MODULE"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lsf/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lsf/b;->e:Lsf/b;

    .line 48
    .line 49
    new-instance v0, Lsf/b;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "<Error property>"

    .line 53
    .line 54
    const-string v3, "ERROR_PROPERTY"

    .line 55
    .line 56
    invoke-direct {v0, v3, v1, v2}, Lsf/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lsf/b;->f:Lsf/b;

    .line 60
    .line 61
    new-instance v0, Lsf/b;

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    const-string v2, "[Error type: %s]"

    .line 65
    .line 66
    const-string v3, "ERROR_TYPE"

    .line 67
    .line 68
    invoke-direct {v0, v3, v1, v2}, Lsf/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lsf/b;->g:Lsf/b;

    .line 72
    .line 73
    new-instance v0, Lsf/b;

    .line 74
    .line 75
    const/4 v1, 0x6

    .line 76
    const-string v2, "<Fake parent for error lexical scope>"

    .line 77
    .line 78
    const-string v3, "PARENT_OF_ERROR_SCOPE"

    .line 79
    .line 80
    invoke-direct {v0, v3, v1, v2}, Lsf/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lsf/b;->h:Lsf/b;

    .line 84
    .line 85
    invoke-static {}, Lsf/b;->a()[Lsf/b;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Lsf/b;->i:[Lsf/b;

    .line 90
    .line 91
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Lsf/b;->j:Lkotlin/enums/EnumEntries;

    .line 96
    .line 97
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lsf/b;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic a()[Lsf/b;
    .locals 7

    .line 1
    sget-object v0, Lsf/b;->b:Lsf/b;

    .line 2
    .line 3
    sget-object v1, Lsf/b;->c:Lsf/b;

    .line 4
    .line 5
    sget-object v2, Lsf/b;->d:Lsf/b;

    .line 6
    .line 7
    sget-object v3, Lsf/b;->e:Lsf/b;

    .line 8
    .line 9
    sget-object v4, Lsf/b;->f:Lsf/b;

    .line 10
    .line 11
    sget-object v5, Lsf/b;->g:Lsf/b;

    .line 12
    .line 13
    sget-object v6, Lsf/b;->h:Lsf/b;

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Lsf/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lsf/b;
    .locals 1

    .line 1
    const-class v0, Lsf/b;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lsf/b;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lsf/b;
    .locals 1

    .line 1
    sget-object v0, Lsf/b;->i:[Lsf/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lsf/b;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/b;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
