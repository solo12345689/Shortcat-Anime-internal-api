.class public final LW1/f;
.super Landroidx/datastore/preferences/protobuf/t;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/L;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW1/f$a;,
        LW1/f$b;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:LW1/f;

.field private static volatile PARSER:Landroidx/datastore/preferences/protobuf/T; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/T;"
        }
    .end annotation
.end field

.field public static final PREFERENCES_FIELD_NUMBER:I = 0x1


# instance fields
.field private preferences_:Landroidx/datastore/preferences/protobuf/E;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/E;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LW1/f;

    .line 2
    .line 3
    invoke-direct {v0}, LW1/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LW1/f;->DEFAULT_INSTANCE:LW1/f;

    .line 7
    .line 8
    const-class v1, LW1/f;

    .line 9
    .line 10
    invoke-static {v1, v0}, Landroidx/datastore/preferences/protobuf/t;->L(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/t;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/t;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroidx/datastore/preferences/protobuf/E;->f()Landroidx/datastore/preferences/protobuf/E;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LW1/f;->preferences_:Landroidx/datastore/preferences/protobuf/E;

    .line 9
    .line 10
    return-void
.end method

.method static synthetic O()LW1/f;
    .locals 1

    .line 1
    sget-object v0, LW1/f;->DEFAULT_INSTANCE:LW1/f;

    .line 2
    .line 3
    return-object v0
.end method

.method static synthetic P(LW1/f;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-direct {p0}, LW1/f;->Q()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private Q()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-direct {p0}, LW1/f;->S()Landroidx/datastore/preferences/protobuf/E;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private S()Landroidx/datastore/preferences/protobuf/E;
    .locals 1

    .line 1
    iget-object v0, p0, LW1/f;->preferences_:Landroidx/datastore/preferences/protobuf/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/E;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LW1/f;->preferences_:Landroidx/datastore/preferences/protobuf/E;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/E;->p()Landroidx/datastore/preferences/protobuf/E;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LW1/f;->preferences_:Landroidx/datastore/preferences/protobuf/E;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LW1/f;->preferences_:Landroidx/datastore/preferences/protobuf/E;

    .line 18
    .line 19
    return-object v0
.end method

.method private T()Landroidx/datastore/preferences/protobuf/E;
    .locals 1

    .line 1
    iget-object v0, p0, LW1/f;->preferences_:Landroidx/datastore/preferences/protobuf/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public static U()LW1/f$a;
    .locals 1

    .line 1
    sget-object v0, LW1/f;->DEFAULT_INSTANCE:LW1/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/t;->o()Landroidx/datastore/preferences/protobuf/t$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LW1/f$a;

    .line 8
    .line 9
    return-object v0
.end method

.method public static V(Ljava/io/InputStream;)LW1/f;
    .locals 1

    .line 1
    sget-object v0, LW1/f;->DEFAULT_INSTANCE:LW1/f;

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroidx/datastore/preferences/protobuf/t;->J(Landroidx/datastore/preferences/protobuf/t;Ljava/io/InputStream;)Landroidx/datastore/preferences/protobuf/t;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LW1/f;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public R()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-direct {p0}, LW1/f;->T()Landroidx/datastore/preferences/protobuf/E;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method protected final r(Landroidx/datastore/preferences/protobuf/t$d;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p2, LW1/e;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, p2, p1

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :pswitch_0
    return-object p2

    .line 20
    :pswitch_1
    const/4 p1, 0x1

    .line 21
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :pswitch_2
    sget-object p1, LW1/f;->PARSER:Landroidx/datastore/preferences/protobuf/T;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    const-class p2, LW1/f;

    .line 31
    .line 32
    monitor-enter p2

    .line 33
    :try_start_0
    sget-object p1, LW1/f;->PARSER:Landroidx/datastore/preferences/protobuf/T;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    new-instance p1, Landroidx/datastore/preferences/protobuf/t$b;

    .line 38
    .line 39
    sget-object p3, LW1/f;->DEFAULT_INSTANCE:LW1/f;

    .line 40
    .line 41
    invoke-direct {p1, p3}, Landroidx/datastore/preferences/protobuf/t$b;-><init>(Landroidx/datastore/preferences/protobuf/t;)V

    .line 42
    .line 43
    .line 44
    sput-object p1, LW1/f;->PARSER:Landroidx/datastore/preferences/protobuf/T;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    monitor-exit p2

    .line 50
    return-object p1

    .line 51
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    throw p1

    .line 53
    :cond_1
    return-object p1

    .line 54
    :pswitch_3
    sget-object p1, LW1/f;->DEFAULT_INSTANCE:LW1/f;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_4
    const-string p1, "preferences_"

    .line 58
    .line 59
    sget-object p2, LW1/f$b;->a:Landroidx/datastore/preferences/protobuf/D;

    .line 60
    .line 61
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const-string p2, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012"

    .line 66
    .line 67
    sget-object p3, LW1/f;->DEFAULT_INSTANCE:LW1/f;

    .line 68
    .line 69
    invoke-static {p3, p2, p1}, Landroidx/datastore/preferences/protobuf/t;->H(Landroidx/datastore/preferences/protobuf/K;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :pswitch_5
    new-instance p1, LW1/f$a;

    .line 75
    .line 76
    invoke-direct {p1, p2}, LW1/f$a;-><init>(LW1/e;)V

    .line 77
    .line 78
    .line 79
    return-object p1

    .line 80
    :pswitch_6
    new-instance p1, LW1/f;

    .line 81
    .line 82
    invoke-direct {p1}, LW1/f;-><init>()V

    .line 83
    .line 84
    .line 85
    return-object p1

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
