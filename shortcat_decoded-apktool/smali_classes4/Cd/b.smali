.class public final LCd/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LCd/b$a;
    }
.end annotation


# static fields
.field public static final r:LCd/b$a;

.field private static final s:Lkotlin/Lazy;


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:Z

.field private final d:Z

.field private final e:Z

.field private final f:Z

.field private final g:I

.field private final h:Lorg/json/JSONObject;

.field private final i:Lorg/json/JSONObject;

.field private final j:LCd/c;

.field private final k:LCd/d;

.field private final l:LCd/d;

.field private final m:D

.field private final n:Ljava/util/Date;

.field private final o:I

.field private final p:Ljava/util/Date;

.field private final q:Ljava/util/Date;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LCd/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LCd/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LCd/b;->r:LCd/b$a;

    .line 8
    .line 9
    new-instance v0, LCd/a;

    .line 10
    .line 11
    invoke-direct {v0}, LCd/a;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, LCd/b;->s:Lkotlin/Lazy;

    .line 19
    .line 20
    return-void
.end method

.method private constructor <init>(ZZZZZZILorg/json/JSONObject;Lorg/json/JSONObject;LCd/c;LCd/d;LCd/d;DLjava/util/Date;ILjava/util/Date;Ljava/util/Date;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, LCd/b;->a:Z

    .line 3
    iput-boolean p2, p0, LCd/b;->b:Z

    .line 4
    iput-boolean p3, p0, LCd/b;->c:Z

    .line 5
    iput-boolean p4, p0, LCd/b;->d:Z

    .line 6
    iput-boolean p5, p0, LCd/b;->e:Z

    .line 7
    iput-boolean p6, p0, LCd/b;->f:Z

    .line 8
    iput p7, p0, LCd/b;->g:I

    .line 9
    iput-object p8, p0, LCd/b;->h:Lorg/json/JSONObject;

    .line 10
    iput-object p9, p0, LCd/b;->i:Lorg/json/JSONObject;

    .line 11
    iput-object p10, p0, LCd/b;->j:LCd/c;

    .line 12
    iput-object p11, p0, LCd/b;->k:LCd/d;

    .line 13
    iput-object p12, p0, LCd/b;->l:LCd/d;

    .line 14
    iput-wide p13, p0, LCd/b;->m:D

    .line 15
    iput-object p15, p0, LCd/b;->n:Ljava/util/Date;

    move/from16 p1, p16

    .line 16
    iput p1, p0, LCd/b;->o:I

    move-object/from16 p1, p17

    .line 17
    iput-object p1, p0, LCd/b;->p:Ljava/util/Date;

    move-object/from16 p1, p18

    .line 18
    iput-object p1, p0, LCd/b;->q:Ljava/util/Date;

    return-void
.end method

.method synthetic constructor <init>(ZZZZZZILorg/json/JSONObject;Lorg/json/JSONObject;LCd/c;LCd/d;LCd/d;DLjava/util/Date;ILjava/util/Date;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move v5, v2

    goto :goto_1

    :cond_1
    move/from16 v5, p2

    :goto_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    move v6, v2

    goto :goto_2

    :cond_2
    move/from16 v6, p3

    :goto_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    move v7, v2

    goto :goto_3

    :cond_3
    move/from16 v7, p4

    :goto_3
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_4

    move v8, v2

    goto :goto_4

    :cond_4
    move/from16 v8, p5

    :goto_4
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_5

    move v9, v2

    goto :goto_5

    :cond_5
    move/from16 v9, p6

    :goto_5
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_6

    move v10, v2

    goto :goto_6

    :cond_6
    move/from16 v10, p7

    :goto_6
    and-int/lit16 v1, v0, 0x80

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    move-object v11, v2

    goto :goto_7

    :cond_7
    move-object/from16 v11, p8

    :goto_7
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_8

    move-object v12, v2

    goto :goto_8

    :cond_8
    move-object/from16 v12, p9

    :goto_8
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_9

    move-object v13, v2

    goto :goto_9

    :cond_9
    move-object/from16 v13, p10

    :goto_9
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_a

    move-object v14, v2

    goto :goto_a

    :cond_a
    move-object/from16 v14, p11

    :goto_a
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_b

    move-object v15, v2

    goto :goto_b

    :cond_b
    move-object/from16 v15, p12

    :goto_b
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_c

    const-wide/16 v16, 0x0

    goto :goto_c

    :cond_c
    move-wide/from16 v16, p13

    :goto_c
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_d

    move-object/from16 v18, v2

    goto :goto_d

    :cond_d
    move-object/from16 v18, p15

    :goto_d
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-object/from16 v20, v2

    goto :goto_e

    :cond_e
    move-object/from16 v20, p17

    :goto_e
    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-eqz v0, :cond_f

    move-object/from16 v21, v2

    :goto_f
    move-object/from16 v3, p0

    move/from16 v19, p16

    goto :goto_10

    :cond_f
    move-object/from16 v21, p18

    goto :goto_f

    .line 19
    :goto_10
    invoke-direct/range {v3 .. v21}, LCd/b;-><init>(ZZZZZZILorg/json/JSONObject;Lorg/json/JSONObject;LCd/c;LCd/d;LCd/d;DLjava/util/Date;ILjava/util/Date;Ljava/util/Date;)V

    return-void
.end method

.method public constructor <init>(ZZZZZZILorg/json/JSONObject;Lorg/json/JSONObject;LCd/c;LCd/d;LCd/d;DLjava/util/Date;Ljava/util/Date;Ljava/util/Date;)V
    .locals 19

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-wide/from16 v13, p13

    move-object/from16 v15, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    .line 21
    invoke-direct/range {v0 .. v18}, LCd/b;-><init>(ZZZZZZILorg/json/JSONObject;Lorg/json/JSONObject;LCd/c;LCd/d;LCd/d;DLjava/util/Date;ILjava/util/Date;Ljava/util/Date;)V

    return-void
.end method

.method public synthetic constructor <init>(ZZZZZZILorg/json/JSONObject;Lorg/json/JSONObject;LCd/c;LCd/d;LCd/d;DLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p18

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move v5, v2

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    move v6, v2

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    move v7, v2

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    goto :goto_6

    :cond_6
    move/from16 v2, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    const/4 v8, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    const/4 v10, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    const/4 v11, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    const/4 v12, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    const/4 v13, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    const-wide/16 v14, 0x0

    goto :goto_c

    :cond_c
    move-wide/from16 v14, p13

    :goto_c
    and-int/lit16 v9, v0, 0x2000

    if-eqz v9, :cond_d

    const/4 v9, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v9, p15

    :goto_d
    move/from16 p19, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    const/4 v1, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v1, p16

    :goto_e
    const v16, 0x8000

    and-int v0, v0, v16

    if-eqz v0, :cond_f

    const/16 p18, 0x0

    :goto_f
    move-object/from16 p1, p0

    move/from16 p2, p19

    move-object/from16 p17, v1

    move/from16 p8, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move-object/from16 p9, v8

    move-object/from16 p16, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-wide/from16 p14, v14

    goto :goto_10

    :cond_f
    move-object/from16 p18, p17

    goto :goto_f

    .line 20
    :goto_10
    invoke-direct/range {p1 .. p18}, LCd/b;-><init>(ZZZZZZILorg/json/JSONObject;Lorg/json/JSONObject;LCd/c;LCd/d;LCd/d;DLjava/util/Date;Ljava/util/Date;Ljava/util/Date;)V

    return-void
.end method

.method public static synthetic a()Ljava/text/SimpleDateFormat;
    .locals 1

    .line 1
    invoke-static {}, LCd/b;->b()Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final b()Ljava/text/SimpleDateFormat;
    .locals 3

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

    .line 4
    .line 5
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "GMT"

    .line 11
    .line 12
    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public static final synthetic c()Lkotlin/Lazy;
    .locals 1

    .line 1
    sget-object v0, LCd/b;->s:Lkotlin/Lazy;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic e(LCd/b;ZZZZZDZILorg/json/JSONObject;Lorg/json/JSONObject;LCd/c;LCd/d;LCd/d;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/Object;)LCd/b;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    .line 1
    iget-boolean v2, v0, LCd/b;->a:Z

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    .line 2
    iget-boolean v3, v0, LCd/b;->b:Z

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    .line 3
    iget-boolean v4, v0, LCd/b;->c:Z

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    .line 4
    iget-boolean v5, v0, LCd/b;->d:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    .line 5
    iget-boolean v6, v0, LCd/b;->e:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    .line 6
    iget-wide v7, v0, LCd/b;->m:D

    goto :goto_5

    :cond_5
    move-wide/from16 v7, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    .line 7
    iget-boolean v9, v0, LCd/b;->f:Z

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    .line 8
    iget v10, v0, LCd/b;->g:I

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    .line 9
    iget-object v11, v0, LCd/b;->h:Lorg/json/JSONObject;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    .line 10
    iget-object v12, v0, LCd/b;->i:Lorg/json/JSONObject;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    .line 11
    iget-object v13, v0, LCd/b;->j:LCd/c;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    .line 12
    iget-object v14, v0, LCd/b;->k:LCd/d;

    goto :goto_b

    :cond_b
    move-object/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    .line 13
    iget-object v15, v0, LCd/b;->l:LCd/d;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p14

    :goto_c
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    .line 14
    iget-object v2, v0, LCd/b;->n:Ljava/util/Date;

    goto :goto_d

    :cond_d
    move-object/from16 v2, p15

    :goto_d
    move-object/from16 p2, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    .line 15
    iget-object v2, v0, LCd/b;->p:Ljava/util/Date;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p16

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    .line 16
    iget-object v1, v0, LCd/b;->q:Ljava/util/Date;

    move-object/from16 p18, v1

    :goto_f
    move-object/from16 p16, p2

    move-object/from16 p17, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move-wide/from16 p7, v7

    move/from16 p9, v9

    move/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_10

    :cond_f
    move-object/from16 p18, p17

    goto :goto_f

    .line 17
    :goto_10
    invoke-virtual/range {p1 .. p18}, LCd/b;->d(ZZZZZDZILorg/json/JSONObject;Lorg/json/JSONObject;LCd/c;LCd/d;LCd/d;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)LCd/b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final d(ZZZZZDZILorg/json/JSONObject;Lorg/json/JSONObject;LCd/c;LCd/d;LCd/d;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)LCd/b;
    .locals 19

    .line 1
    new-instance v0, LCd/b;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget v2, v1, LCd/b;->o:I

    .line 6
    .line 7
    add-int/lit8 v16, v2, 0x1

    .line 8
    .line 9
    move/from16 v1, p1

    .line 10
    .line 11
    move/from16 v2, p2

    .line 12
    .line 13
    move/from16 v3, p3

    .line 14
    .line 15
    move/from16 v4, p4

    .line 16
    .line 17
    move/from16 v5, p5

    .line 18
    .line 19
    move-wide/from16 v13, p6

    .line 20
    .line 21
    move/from16 v6, p8

    .line 22
    .line 23
    move/from16 v7, p9

    .line 24
    .line 25
    move-object/from16 v8, p10

    .line 26
    .line 27
    move-object/from16 v9, p11

    .line 28
    .line 29
    move-object/from16 v10, p12

    .line 30
    .line 31
    move-object/from16 v11, p13

    .line 32
    .line 33
    move-object/from16 v12, p14

    .line 34
    .line 35
    move-object/from16 v15, p15

    .line 36
    .line 37
    move-object/from16 v17, p16

    .line 38
    .line 39
    move-object/from16 v18, p17

    .line 40
    .line 41
    invoke-direct/range {v0 .. v18}, LCd/b;-><init>(ZZZZZZILorg/json/JSONObject;Lorg/json/JSONObject;LCd/c;LCd/d;LCd/d;DLjava/util/Date;ILjava/util/Date;Ljava/util/Date;)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method

.method public final f()Landroid/os/Bundle;
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "isStartupProcedureRunning"

    .line 7
    .line 8
    iget-boolean v2, p0, LCd/b;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    const-string v1, "isUpdateAvailable"

    .line 14
    .line 15
    iget-boolean v2, p0, LCd/b;->b:Z

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    const-string v1, "isUpdatePending"

    .line 21
    .line 22
    iget-boolean v2, p0, LCd/b;->c:Z

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v1, "isChecking"

    .line 28
    .line 29
    iget-boolean v2, p0, LCd/b;->d:Z

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    const-string v1, "isDownloading"

    .line 35
    .line 36
    iget-boolean v2, p0, LCd/b;->e:Z

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    const-string v1, "isRestarting"

    .line 42
    .line 43
    iget-boolean v2, p0, LCd/b;->f:Z

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v1, "restartCount"

    .line 49
    .line 50
    iget v2, p0, LCd/b;->g:I

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    const-string v1, "sequenceNumber"

    .line 56
    .line 57
    iget v2, p0, LCd/b;->o:I

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    const-string v1, "downloadProgress"

    .line 63
    .line 64
    iget-wide v2, p0, LCd/b;->m:D

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, LCd/b;->h:Lorg/json/JSONObject;

    .line 70
    .line 71
    if-eqz v1, :cond_0

    .line 72
    .line 73
    const-string v2, "latestManifestString"

    .line 74
    .line 75
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_0
    iget-object v1, p0, LCd/b;->i:Lorg/json/JSONObject;

    .line 83
    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    const-string v2, "downloadedManifestString"

    .line 87
    .line 88
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_1
    iget-object v1, p0, LCd/b;->j:LCd/c;

    .line 96
    .line 97
    if-eqz v1, :cond_2

    .line 98
    .line 99
    new-instance v1, Landroid/os/Bundle;

    .line 100
    .line 101
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 102
    .line 103
    .line 104
    iget-object v2, p0, LCd/b;->j:LCd/c;

    .line 105
    .line 106
    invoke-virtual {v2}, LCd/c;->a()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    const-string v3, "commitTime"

    .line 111
    .line 112
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    sget-object v2, LTd/L;->a:LTd/L;

    .line 116
    .line 117
    const-string v2, "rollback"

    .line 118
    .line 119
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 120
    .line 121
    .line 122
    :cond_2
    iget-object v1, p0, LCd/b;->k:LCd/d;

    .line 123
    .line 124
    const-string v2, "message"

    .line 125
    .line 126
    if-eqz v1, :cond_3

    .line 127
    .line 128
    new-instance v1, Landroid/os/Bundle;

    .line 129
    .line 130
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 131
    .line 132
    .line 133
    iget-object v3, p0, LCd/b;->k:LCd/d;

    .line 134
    .line 135
    invoke-virtual {v3}, LCd/d;->b()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const-string v3, "checkError"

    .line 143
    .line 144
    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 145
    .line 146
    .line 147
    :cond_3
    iget-object v1, p0, LCd/b;->l:LCd/d;

    .line 148
    .line 149
    if-eqz v1, :cond_4

    .line 150
    .line 151
    new-instance v1, Landroid/os/Bundle;

    .line 152
    .line 153
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 154
    .line 155
    .line 156
    iget-object v3, p0, LCd/b;->l:LCd/d;

    .line 157
    .line 158
    invoke-virtual {v3}, LCd/d;->b()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    const-string v2, "downloadError"

    .line 166
    .line 167
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 168
    .line 169
    .line 170
    :cond_4
    iget-object v1, p0, LCd/b;->n:Ljava/util/Date;

    .line 171
    .line 172
    if-eqz v1, :cond_5

    .line 173
    .line 174
    sget-object v1, LCd/b;->r:LCd/b$a;

    .line 175
    .line 176
    invoke-virtual {v1}, LCd/b$a;->a()Ljava/text/SimpleDateFormat;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    iget-object v2, p0, LCd/b;->n:Ljava/util/Date;

    .line 181
    .line 182
    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    const-string v2, "lastCheckForUpdateTimeString"

    .line 187
    .line 188
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :cond_5
    return-object v0
.end method

.method public final g()Ljava/util/Map;
    .locals 11

    .line 1
    iget-boolean v0, p0, LCd/b;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "isStartupProcedureRunning"

    .line 8
    .line 9
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-boolean v0, p0, LCd/b;->b:Z

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "isUpdateAvailable"

    .line 20
    .line 21
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-boolean v0, p0, LCd/b;->c:Z

    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "isUpdatePending"

    .line 32
    .line 33
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-boolean v0, p0, LCd/b;->d:Z

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "isChecking"

    .line 44
    .line 45
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    iget-boolean v0, p0, LCd/b;->e:Z

    .line 50
    .line 51
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v1, "isDownloading"

    .line 56
    .line 57
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iget-boolean v0, p0, LCd/b;->f:Z

    .line 62
    .line 63
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v1, "isRestarting"

    .line 68
    .line 69
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    iget v0, p0, LCd/b;->g:I

    .line 74
    .line 75
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-string v1, "restartCount"

    .line 80
    .line 81
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    iget-wide v0, p0, LCd/b;->m:D

    .line 86
    .line 87
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    const-string v1, "downloadProgress"

    .line 92
    .line 93
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    iget v0, p0, LCd/b;->o:I

    .line 98
    .line 99
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const-string v1, "sequenceNumber"

    .line 104
    .line 105
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    filled-new-array/range {v2 .. v10}, [Lkotlin/Pair;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, LUd/S;->n([Lkotlin/Pair;)Ljava/util/Map;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-object v1, p0, LCd/b;->h:Lorg/json/JSONObject;

    .line 118
    .line 119
    if-eqz v1, :cond_0

    .line 120
    .line 121
    const-string v2, "latestManifest"

    .line 122
    .line 123
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :cond_0
    iget-object v1, p0, LCd/b;->i:Lorg/json/JSONObject;

    .line 127
    .line 128
    if-eqz v1, :cond_1

    .line 129
    .line 130
    const-string v2, "downloadedManifest"

    .line 131
    .line 132
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    :cond_1
    iget-object v1, p0, LCd/b;->j:LCd/c;

    .line 136
    .line 137
    if-eqz v1, :cond_2

    .line 138
    .line 139
    const-string v2, "rollback"

    .line 140
    .line 141
    invoke-virtual {v1}, LCd/c;->b()Ljava/util/Map;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    :cond_2
    iget-object v1, p0, LCd/b;->k:LCd/d;

    .line 149
    .line 150
    if-eqz v1, :cond_3

    .line 151
    .line 152
    const-string v2, "checkError"

    .line 153
    .line 154
    invoke-virtual {v1}, LCd/d;->a()Ljava/util/Map;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    :cond_3
    iget-object v1, p0, LCd/b;->l:LCd/d;

    .line 162
    .line 163
    if-eqz v1, :cond_4

    .line 164
    .line 165
    const-string v2, "downloadError"

    .line 166
    .line 167
    invoke-virtual {v1}, LCd/d;->a()Ljava/util/Map;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    :cond_4
    iget-object v1, p0, LCd/b;->n:Ljava/util/Date;

    .line 175
    .line 176
    if-eqz v1, :cond_5

    .line 177
    .line 178
    const-string v2, "lastCheckForUpdateTime"

    .line 179
    .line 180
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    :cond_5
    iget-object v1, p0, LCd/b;->p:Ljava/util/Date;

    .line 184
    .line 185
    if-eqz v1, :cond_6

    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    .line 188
    .line 189
    .line 190
    move-result-wide v1

    .line 191
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    const-string v2, "downloadStartTime"

    .line 196
    .line 197
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    :cond_6
    iget-object v1, p0, LCd/b;->q:Ljava/util/Date;

    .line 201
    .line 202
    if-eqz v1, :cond_7

    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    .line 205
    .line 206
    .line 207
    move-result-wide v1

    .line 208
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    const-string v2, "downloadFinishTime"

    .line 213
    .line 214
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    :cond_7
    return-object v0
.end method

.method public final h()LCd/b;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, LCd/b;

    .line 4
    .line 5
    iget v2, v0, LCd/b;->g:I

    .line 6
    .line 7
    add-int/lit8 v8, v2, 0x1

    .line 8
    .line 9
    iget v2, v0, LCd/b;->o:I

    .line 10
    .line 11
    add-int/lit8 v17, v2, 0x1

    .line 12
    .line 13
    const v20, 0x1bfbf

    .line 14
    .line 15
    .line 16
    const/16 v21, 0x0

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v9, 0x0

    .line 25
    const/4 v10, 0x0

    .line 26
    const/4 v11, 0x0

    .line 27
    const/4 v12, 0x0

    .line 28
    const/4 v13, 0x0

    .line 29
    const-wide/16 v14, 0x0

    .line 30
    .line 31
    const/16 v16, 0x0

    .line 32
    .line 33
    const/16 v18, 0x0

    .line 34
    .line 35
    const/16 v19, 0x0

    .line 36
    .line 37
    invoke-direct/range {v1 .. v21}, LCd/b;-><init>(ZZZZZZILorg/json/JSONObject;Lorg/json/JSONObject;LCd/c;LCd/d;LCd/d;DLjava/util/Date;ILjava/util/Date;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    .line 39
    .line 40
    return-object v1
.end method
