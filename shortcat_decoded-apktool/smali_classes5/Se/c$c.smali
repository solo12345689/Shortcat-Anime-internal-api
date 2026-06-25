.class public final enum LSe/c$c;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSe/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field public static final enum b:LSe/c$c;

.field public static final enum c:LSe/c$c;

.field public static final enum d:LSe/c$c;

.field public static final enum e:LSe/c$c;

.field public static final enum f:LSe/c$c;

.field public static final enum g:LSe/c$c;

.field public static final enum h:LSe/c$c;

.field private static i:LZe/j$b;

.field private static final synthetic j:[LSe/c$c;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, LSe/c$c;

    .line 2
    .line 3
    const-string v1, "CLASS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2, v2}, LSe/c$c;-><init>(Ljava/lang/String;III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LSe/c$c;->b:LSe/c$c;

    .line 10
    .line 11
    new-instance v1, LSe/c$c;

    .line 12
    .line 13
    const-string v2, "INTERFACE"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3, v3}, LSe/c$c;-><init>(Ljava/lang/String;III)V

    .line 17
    .line 18
    .line 19
    sput-object v1, LSe/c$c;->c:LSe/c$c;

    .line 20
    .line 21
    new-instance v2, LSe/c$c;

    .line 22
    .line 23
    const-string v3, "ENUM_CLASS"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4, v4}, LSe/c$c;-><init>(Ljava/lang/String;III)V

    .line 27
    .line 28
    .line 29
    sput-object v2, LSe/c$c;->d:LSe/c$c;

    .line 30
    .line 31
    new-instance v3, LSe/c$c;

    .line 32
    .line 33
    const-string v4, "ENUM_ENTRY"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5, v5, v5}, LSe/c$c;-><init>(Ljava/lang/String;III)V

    .line 37
    .line 38
    .line 39
    sput-object v3, LSe/c$c;->e:LSe/c$c;

    .line 40
    .line 41
    new-instance v4, LSe/c$c;

    .line 42
    .line 43
    const-string v5, "ANNOTATION_CLASS"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v5, v6, v6, v6}, LSe/c$c;-><init>(Ljava/lang/String;III)V

    .line 47
    .line 48
    .line 49
    sput-object v4, LSe/c$c;->f:LSe/c$c;

    .line 50
    .line 51
    new-instance v5, LSe/c$c;

    .line 52
    .line 53
    const-string v6, "OBJECT"

    .line 54
    .line 55
    const/4 v7, 0x5

    .line 56
    invoke-direct {v5, v6, v7, v7, v7}, LSe/c$c;-><init>(Ljava/lang/String;III)V

    .line 57
    .line 58
    .line 59
    sput-object v5, LSe/c$c;->g:LSe/c$c;

    .line 60
    .line 61
    new-instance v6, LSe/c$c;

    .line 62
    .line 63
    const-string v7, "COMPANION_OBJECT"

    .line 64
    .line 65
    const/4 v8, 0x6

    .line 66
    invoke-direct {v6, v7, v8, v8, v8}, LSe/c$c;-><init>(Ljava/lang/String;III)V

    .line 67
    .line 68
    .line 69
    sput-object v6, LSe/c$c;->h:LSe/c$c;

    .line 70
    .line 71
    filled-new-array/range {v0 .. v6}, [LSe/c$c;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, LSe/c$c;->j:[LSe/c$c;

    .line 76
    .line 77
    new-instance v0, LSe/c$c$a;

    .line 78
    .line 79
    invoke-direct {v0}, LSe/c$c$a;-><init>()V

    .line 80
    .line 81
    .line 82
    sput-object v0, LSe/c$c;->i:LZe/j$b;

    .line 83
    .line 84
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p4, p0, LSe/c$c;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static a(I)LSe/c$c;
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0

    .line 6
    :pswitch_0
    sget-object p0, LSe/c$c;->h:LSe/c$c;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_1
    sget-object p0, LSe/c$c;->g:LSe/c$c;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_2
    sget-object p0, LSe/c$c;->f:LSe/c$c;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_3
    sget-object p0, LSe/c$c;->e:LSe/c$c;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_4
    sget-object p0, LSe/c$c;->d:LSe/c$c;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_5
    sget-object p0, LSe/c$c;->c:LSe/c$c;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_6
    sget-object p0, LSe/c$c;->b:LSe/c$c;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)LSe/c$c;
    .locals 1

    .line 1
    const-class v0, LSe/c$c;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LSe/c$c;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LSe/c$c;
    .locals 1

    .line 1
    sget-object v0, LSe/c$c;->j:[LSe/c$c;

    .line 2
    .line 3
    invoke-virtual {v0}, [LSe/c$c;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LSe/c$c;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, LSe/c$c;->a:I

    .line 2
    .line 3
    return v0
.end method
